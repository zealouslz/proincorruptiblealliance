package com.onlineplatform.proincorruptiblealliance.core;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Description：返回结果包装类
 * @author：chenyufeng
 * @since：2020/8/7
 */
@ApiModel(value="返回参数", description="返回参数")
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 8157613083634272196L;
    @ApiModelProperty(name = "是否成功",example = "true")
    private Boolean success;
    @ApiModelProperty(name = "结果代码",example = "200")
    private Integer code;
    @ApiModelProperty(name = "返回结果信息",example = "操作成功")
    private String msg;
    @ApiModelProperty(name = "成功时返回的数据")
    private T data;

    public Result(boolean success, int code, String msg, T data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result error() {
        return error(500, "未知异常，请联系管理员");
    }

    public static Result error(String msg) {
        return error(500, msg);
    }

    public static Result error(int code, String msg) {
        return new Result(false, code, msg,null);
    }

    public static Result ok() {
        return new Result(true, 200, "操作成功",null);
    }

    public static Result ok(String msg) {
        return new Result(true, 200, msg,null);
    }

    public static <T> Result<T> data(T data) {
        return new Result<T>(true, 200, "操作成功",data);
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
