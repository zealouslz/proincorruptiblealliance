package com.onlineplatform.proincorruptiblealliance.service;

import com.onlineplatform.proincorruptiblealliance.dto.UpdateItem;
import com.onlineplatform.proincorruptiblealliance.entity.Item;
import com.onlineplatform.proincorruptiblealliance.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Auther liuze
 * @Date 2022/10/29
 */
@Service
public class ItemServiceImpl  implements ItemService{
    @Autowired
    ItemMapper itemMapper;
    @Override
    public int addNewItem(Item item) {
        int insert = itemMapper.insertItem(item);
        return insert;
    }

    @Override
    public int updateById(UpdateItem item) {
        int i = itemMapper.updateById(item);
        return i;
    }

    @Override
    public List<Item> selectByModularAndType(int modular, int type) {
        List<Item> items = itemMapper.selectByModularAndType(modular, type);
        return items;
    }

    @Override
    public List<Item> selectByModularAndTypeLimit5(int modular, int type) {
        List<Item> items = itemMapper.selectByModularAndTypeLimit5(modular, type);
        return items;
    }

    @Override
    public List<Item> searchList(int modualr, int type, String date, String itemName) {
        List<Item> items = itemMapper.searchList(modualr, type, date, itemName);
        return items;
    }

    @Override
    public int updateSerialNo(String itemId,int serialNo) {
        int i = itemMapper.updateSerialNo(itemId, serialNo);
        return i;
    }

    @Override
    public int deleteById(String id) {
        int i = itemMapper.deleteById(id);
        return i;
    }
}
