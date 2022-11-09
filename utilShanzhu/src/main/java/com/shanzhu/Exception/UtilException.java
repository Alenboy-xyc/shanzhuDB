package com.shanzhu.Exception;

import com.shanzhu.exceptionShanzhu.BaseException;

/**
 * @author shanzhu
 * @description
 * @create 2022/11/8
 */
public class UtilException extends BaseException {
    public static final UtilException PARAMETER_ERR = new UtilException(false,"参数异常",201);
    public static final UtilException PARSE_ERR = new UtilException(false,"时间转换异常",202);
    protected UtilException(Boolean success, String message, int errCode) {
        super(success, message, errCode);
    }
}
