package com.onlineplatform.proincorruptiblealliance.service;

import com.onlineplatform.proincorruptiblealliance.dto.UpdateItem;
import com.onlineplatform.proincorruptiblealliance.entity.Item;

import java.util.Date;
import java.util.List;

/**
 * @Auther liuze
 * @Date 2022/10/29
 */
public interface ItemService {
    int addNewItem(Item item);
    int updateById(UpdateItem item);
    List<Item> selectByModularAndType(int modular, int type);
    List<Item> selectByModularAndTypeLimit5(int modular, int type);
    List<Item> searchList(int modualr, int type,String date, String itemName);
    int updateSerialNo(String itemId,int serialNo);
    int deleteById(String id);
}
