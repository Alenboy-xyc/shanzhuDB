package com.shanzhu.conf;

import com.shanzhu.exceptionShanzhu.BaseException;

/**
 * @author shanzhu
 * @description
 * @create 2022/11/7
 */
public class ApiException extends BaseException{
    public static final ApiException OK = new ApiException(true,"",200);
    public static final ApiException PARAMETER_ERR = new ApiException(false,"参数异常",201);

    protected ApiException(Boolean success, String message, int errCode) {
        super(success, message, errCode);
    }
}
