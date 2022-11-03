package com.onlineplatform.proincorruptiblealliance.dto;

import com.onlineplatform.proincorruptiblealliance.entity.Item;

import java.util.List;

/**
 * @Auther liuze
 * @Date 2022/10/29
 */

public class TypeAndItemList {
    private Integer typeId;

    private String typeName;

    private Integer belongModular;
    private List<Item> items;

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setBelongModular(Integer belongModular) {
        this.belongModular = belongModular;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public Integer getBelongModular() {
        return belongModular;
    }

    public List<Item> getItems() {
        return items;
    }
}
