package com.shanzhu.controller;

import com.shanzhu.Exception.UtilException;
import com.shanzhu.service.UtilDateService;
import com.shanzhu.utils.R;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

/**
 * @author shanzhu
 * @description
 * @create 2022/11/8
 */
@RestController
@RequestMapping("/date")
@SuppressWarnings("all")
public class UtilDateController {
    @Autowired
    private UtilDateService utilDateService;

    @RequestMapping(value = "/dateFormat",method = RequestMethod.GET)
    public R dateFormat(@RequestParam("dateFormat") String dateFormat,@RequestParam("timeZone") Integer timeZone) throws ParseException {
        if (StringUtils.isBlank(dateFormat)){
            return R.base(UtilException.PARAMETER_ERR);
        }
        long timeInMillis = 0;
        try {
            timeInMillis = utilDateService.getTimeStampByDate(dateFormat, timeZone);
        }catch (Exception e){
            return R.base(UtilException.PARSE_ERR);
        }
        return R.ok().data("timeInMillis",timeInMillis);
    }

}
