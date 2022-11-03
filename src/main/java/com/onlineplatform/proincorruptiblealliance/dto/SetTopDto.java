package com.onlineplatform.proincorruptiblealliance.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @Auther liuze
 * @Date 2022/10/30
 */
public class SetTopDto {
    @ApiModelProperty("标题编码")
    private String itemId;
    @ApiModelProperty("所属廉盟类型")
    private Integer belongType;
    @ApiModelProperty("所属模块编码")
    private Integer belongModular;

    public String getItemId() {
        return itemId;
    }

    public Integer getBelongType() {
        return belongType;
    }

    public Integer getBelongModular() {
        return belongModular;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setBelongType(Integer belongType) {
        this.belongType = belongType;
    }

    public void setBelongModular(Integer belongModular) {
        this.belongModular = belongModular;
    }
}
