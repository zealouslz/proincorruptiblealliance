package com.onlineplatform.proincorruptiblealliance.dto;

/**
 * @Auther liuze
 * @Date 2022/10/28
 */

import com.onlineplatform.proincorruptiblealliance.entity.LianmengType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value="模块及其对应的类型", description="模块及其对应的类型")
public class ModularAndType {
    @ApiModelProperty("模块编码")
    private Integer modularId;

    @ApiModelProperty("模块名字")
    private String modularName;

    @ApiModelProperty("类型集合")
    private List<LianmengType> lianmengTypes;

    public ModularAndType() {
        this.modularId = modularId;
        this.modularName = modularName;
        this.lianmengTypes = lianmengTypes;
    }

    public Integer getModularId() {
        return modularId;
    }

    public String getModularName() {
        return modularName;
    }

    public List<LianmengType> getLianmengTypes() {
        return lianmengTypes;
    }

    public void setModularId(Integer modularId) {
        this.modularId = modularId;
    }

    public void setModularName(String modularName) {
        this.modularName = modularName;
    }

    public void setLianmengTypes(List<LianmengType> lianmengTypes) {
        this.lianmengTypes = lianmengTypes;
    }
}
