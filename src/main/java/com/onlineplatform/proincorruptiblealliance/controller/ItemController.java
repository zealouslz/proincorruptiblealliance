package com.onlineplatform.proincorruptiblealliance.controller;

import com.onlineplatform.proincorruptiblealliance.core.Result;
import com.onlineplatform.proincorruptiblealliance.dto.*;
import com.onlineplatform.proincorruptiblealliance.entity.File;
import com.onlineplatform.proincorruptiblealliance.entity.Item;
import com.onlineplatform.proincorruptiblealliance.entity.LianmengType;
import com.onlineplatform.proincorruptiblealliance.service.FileService;
import com.onlineplatform.proincorruptiblealliance.service.ItemService;
import com.onlineplatform.proincorruptiblealliance.service.ModularAndTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Auther liuze
 * @Date 2022/10/28
 */
@RestController
@RequestMapping("itemList")
@Controller
@Api(value = "列表操作", tags = {"列表操作"})
public class ItemController {

    @Autowired
    ModularAndTypeService modularAndTypeService;
    @Autowired
    ItemService itemService;
    @Autowired
    FileService fileService;

    @GetMapping("modularAndType")
    @ApiOperation("获取模块和其对应的类型")
    public Result<List<ModularAndType>> getModularAndType(){
        List<ModularAndType> modularAndType = modularAndTypeService.getModularAndType();
        return Result.data(modularAndType);
    }

//    @PostMapping("newAddItem")
//    @ApiOperation("新增文件")
//    public Result newAdd(@RequestParam("multipartFile") MultipartFile multipartFile, NewAddDto newAddDto ){
//
//
//    }
    @PostMapping("newAddItem")
    @ApiOperation("新增标题")
    public Result newAdd(@RequestBody Item item){
        List<Item> items = itemService.selectByModularAndType(item.getBelongModular(), item.getBelongType());
        item.setSerialNo(items.size()+1);
        int i = itemService.addNewItem(item);

        if(i==1){
            return Result.ok();
        }else {
            return Result.error("新增失败！");
        }

    }
    @PostMapping("updateItem")
    @ApiOperation("编辑标题")
    public Result updateItem(@RequestBody UpdateItem updateItem){
        int i= itemService.updateById(updateItem);

        if(i==1){
            return Result.ok();
        }else {
            return Result.error("新增失败！");
        }

    }

    @PostMapping("newAddFile")
    @ApiOperation("上传文件")
    public Result newAddFile(@RequestParam("multipartFile") MultipartFile multipartFile,NewAddDto newAddDto) throws IOException {
        if (multipartFile.isEmpty()){
            return Result.error(403,"文件内容不能为空");
        }
        File file = new File();
        file.setFileName(multipartFile.getOriginalFilename());
        file.setContent(multipartFile.getBytes());
        file.setFileId(UUID.randomUUID().toString());
        file.setBelongItemId(newAddDto.getBelongItemId());
        int i = fileService.addNewFile(file);
        if(i==1){
            return Result.ok();
        }else {
            return Result.error("上传失败！");
        }
    }

    @PostMapping("deleteByItemId")
    @ApiOperation("根据标题编码删除删除文件")
    public Result deleteByItemId(@RequestParam("itemId")String itemId){
        int i = fileService.deleteByItemId(itemId);
        if(i==1){
            return Result.ok();
        }else {
            return Result.error("删除失败！");
        }
    }

    @GetMapping("bulletinBoardList")
    @ApiOperation("获取看板页面的列表")
    public  Result<List<BulletinBoardList>> getBulletinBoardList(){
        List<ModularAndType> modularAndTypes = modularAndTypeService.getModularAndType();
        List<BulletinBoardList> bulletinBoardLists=new ArrayList<>();
        for (ModularAndType m:modularAndTypes) {
            BulletinBoardList bulletinBoardList= new BulletinBoardList();
            bulletinBoardList.setModularId(m.getModularId());
            bulletinBoardList.setModularName(m.getModularName());
            List<LianmengType> lianmengTypes = m.getLianmengTypes();

            List<TypeAndItemList> typeAndItemLists = new ArrayList<>();
            for (LianmengType lianmengType:lianmengTypes) {
                TypeAndItemList typeAndItemList = new TypeAndItemList();
                typeAndItemList.setTypeId(lianmengType.getTypeId());
                typeAndItemList.setBelongModular(lianmengType.getBelongModular());
                typeAndItemList.setTypeName(lianmengType.getTypeName());
                List<Item> items = itemService.selectByModularAndTypeLimit5(lianmengType.getBelongModular(), lianmengType.getTypeId());
                typeAndItemList.setItems(items);
                typeAndItemLists.add(typeAndItemList);
            }
            bulletinBoardList.setTypeAndItemLists(typeAndItemLists);
            bulletinBoardLists.add(bulletinBoardList);
        }
        return Result.data(bulletinBoardLists);
    }

    @GetMapping("searchList")
    @ApiOperation("查询列表")
    public Result<List<Item>> searchList(int modualr, int type,
                                         String date,String itemName){
        List<Item> items = itemService.searchList(modualr, type, date, itemName);
        return Result.data(items);

    }

    @PostMapping("setTopping")
    @ApiOperation("置顶")
    public Result setTopping(@RequestBody SetTopDto setTopDto){
        List<Item> items = itemService.selectByModularAndType(setTopDto.getBelongModular(), setTopDto.getBelongType());
        List<String> sortItemIds =new ArrayList<>();
        sortItemIds.add(setTopDto.getItemId());
        for (Item e: items) {
            if(!e.getItemId().equals(setTopDto.getItemId())){
                sortItemIds.add(e.getItemId());
            }
        }
        int serialNo=1;
        int count=0;
        for (String s: sortItemIds) {
            int i = itemService.updateSerialNo(s, serialNo);
            count+=i;
            serialNo++;
        }
        if(count==sortItemIds.size()){
            return Result.ok();
        }else {
            return Result.error();
        }
    }
    @PostMapping("deleteItem")
    @ApiOperation("删除")
    public Result deleteItem(@RequestBody SetTopDto setTopDto){
        int i = itemService.deleteById(setTopDto.getItemId());
        fileService.deleteByItemId(setTopDto.getItemId());
        if(i==1){
            List<Item> items = itemService.selectByModularAndType(setTopDto.getBelongModular(), setTopDto.getBelongType());
            int serialNo=1;
            int count=0;
            for (Item item:items) {
                int result = itemService.updateSerialNo(item.getItemId(), serialNo);
                count+=result;
                serialNo++;
            }
            if(count==items.size()){
                return Result.ok();
            }else {
                return Result.error("更新序号失败");
            }
        }else {
            return Result.error("删除失败");
        }

    }

}
