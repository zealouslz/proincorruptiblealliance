package com.onlineplatform.proincorruptiblealliance.entity;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class Item {
    @ApiModelProperty("标题编码")
    private String itemId;
    @ApiModelProperty("标题名")
    private String itemName;
    @ApiModelProperty("创建日期")
    private Date createDate;
    @ApiModelProperty("创建人")
    private String creatorName;
    @ApiModelProperty("创建人编码")
    private String creatorId;
    @ApiModelProperty("编辑器内容")
    private String htmlContent;
    @ApiModelProperty("所属廉盟类型")
    private Integer belongType;
    @ApiModelProperty("所属模块编码")
    private Integer belongModular;
    @ApiModelProperty("序号")
    private Integer serialNo;

    public void setSerialNo(Integer serialNo) {
        this.serialNo = serialNo;
    }

    public Integer getSerialNo() {
        return serialNo;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent == null ? null : htmlContent.trim();
    }

    public Integer getBelongType() {
        return belongType;
    }

    public void setBelongType(Integer belongType) {
        this.belongType = belongType;
    }

    public Integer getBelongModular() {
        return belongModular;
    }

    public void setBelongModular(Integer belongModular) {
        this.belongModular = belongModular;
    }
}