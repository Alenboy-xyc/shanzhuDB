package com.shanzhu.exceptionShanzhu;

import lombok.Data;

/**
 * @author shanzhu
 * @description 异常处理核心模块
 * @create 2022/11/6
 */
@Data
public class BaseException{
    private Boolean success;
    private String message;
    private int errCode;
    protected BaseException(Boolean success, String message, int errCode) {
        this.success = success;
        this.message = message;
        this.errCode = errCode;
    }
}
