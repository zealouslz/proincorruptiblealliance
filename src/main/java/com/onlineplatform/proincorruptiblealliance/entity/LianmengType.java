package com.onlineplatform.proincorruptiblealliance.entity;

public class LianmengType {
    private Integer typeId;

    private String typeName;

    private Integer belongModular;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Integer getBelongModular() {
        return belongModular;
    }

    public void setBelongModular(Integer belongModular) {
        this.belongModular = belongModular;
    }
}