package com.onlineplatform.proincorruptiblealliance.dto;

import io.swagger.annotations.ApiModel;

import java.util.List;

/**
 * @Auther liuze
 * @Date 2022/10/29
 */
@ApiModel(value="看板页面列表", description="看板页面列表")
public class BulletinBoardList {

    private int modularId;

    private String modularName;

    private List<TypeAndItemList> typeAndItemLists;

    public int getModularId() {
        return modularId;
    }

    public String getModularName() {
        return modularName;
    }

    public List<TypeAndItemList> getTypeAndItemLists() {
        return typeAndItemLists;
    }

    public void setModularId(int modularId) {
        this.modularId = modularId;
    }

    public void setModularName(String modularName) {
        this.modularName = modularName;
    }

    public void setTypeAndItemLists(List<TypeAndItemList> typeAndItemLists) {
        this.typeAndItemLists = typeAndItemLists;
    }
}
