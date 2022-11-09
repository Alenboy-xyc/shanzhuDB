package com.shanzhu.client;

import com.shanzhu.utils.R;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author shanzhu
 * @description
 * @create 2022/11/8
 */
@Component
public class SentinelExceptionHandler implements UtilsService{
    @Override
    public R dateFormat(String date, Integer timeZone) {
        return R.error().message("出现问题");
    }
}
