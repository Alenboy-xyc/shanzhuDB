package com.shanzhu.controller;

import com.shanzhu.client.UtilsService;
import com.shanzhu.conf.ApiException;
import com.shanzhu.utils.R;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

/**
 * @author shanzhu
 * @description
 * @create 2022/11/8
 */
@RestController
@RequestMapping("/date")
@SuppressWarnings("all")
public class ApiUtilController {
    @Autowired
    @Lazy
    private UtilsService utilsService;

    //时间戳转换为时间
    @RequestMapping(value = "/dateFormat", method = RequestMethod.GET,produces = {"application/json;charset=utf-8"})
    public R dateFormat(@RequestParam("dateFormat") String dateFormat,
                        @RequestParam("timeZone") Integer timeZone) {
        if (StringUtils.isBlank(dateFormat)){
            return R.base(ApiException.PARAMETER_ERR);
        }
        R r = utilsService.dateFormat(dateFormat,timeZone);
        return r;
    }
}
