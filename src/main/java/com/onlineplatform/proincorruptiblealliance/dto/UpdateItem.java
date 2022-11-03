package com.onlineplatform.proincorruptiblealliance.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Auther liuze
 * @Date 2022/10/30
 */
public class UpdateItem {
    @ApiModelProperty("标题编码")
    private String itemId;
    @ApiModelProperty("标题名")
    private String itemName;
    @ApiModelProperty("编辑器内容")
    private String htmlContent;

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getHtmlContent() {
        return htmlContent;
    }
}
