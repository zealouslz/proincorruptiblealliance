package com.onlineplatform.proincorruptiblealliance.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @Auther liuze
 * @Date 2022/10/29
 */
@ApiModel(value="上传文件参数", description="上传文件参数")
public class NewAddDto {
    @ApiModelProperty("所属标题Id")
    private String belongItemId;

    public String getBelongItemId() {
        return belongItemId;
    }

    public void setBelongItemId(String belongItemId) {
        this.belongItemId = belongItemId;
    }
}
