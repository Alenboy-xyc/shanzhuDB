package com.shanzhu.utils;

import com.shanzhu.exceptionShanzhu.BaseException;
import com.shanzhu.exceptionShanzhu.ResultCode;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shanzhu
 * @description
 * @create 2022/11/6
 */
@Data
public class R {
    private Boolean success;
    private Integer code;
    private String message;
    private Map<String, Object> data = new HashMap<>();

    private R() {}

    public static R ok(){
        R r = new R();
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS_CODE);
        r.setMessage("成功");
        return r;
    }

    public static R error(){
        R r = new R();
        r.setSuccess(false);
        r.setCode(ResultCode.FAILURE_CODE);
        r.setMessage("失败");
        return r;
    }

    public static R base(BaseException baseException){
        R r = new R();
        r.setSuccess(baseException.getSuccess());
        r.setCode(baseException.getErrCode());
        r.setMessage(baseException.getMessage());
        return r;
    }
    //链式结构
    public R success(Boolean success){
        this.success(success);
        return this;
    }
    public R message(String message){
        this.message(message);
        return this;
    }
    public R code(Integer code){
        this.code(code);
        return this;
    }
    public R data(String key, Object value){
        this.data.put(key, value);
        return this;
    }
    public R data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
    public <E extends BaseException> R all(E exception){
        BaseException except = exception;
        this.setMessage(except.getMessage());
        this.code(except.getErrCode());
        this.setSuccess(except.getSuccess());
        return this;
    }
}
