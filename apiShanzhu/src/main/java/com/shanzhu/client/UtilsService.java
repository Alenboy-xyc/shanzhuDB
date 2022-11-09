package com.shanzhu.client;

import com.shanzhu.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(value = "UTIL-SHANZHU",fallback = SentinelExceptionHandler.class)
public interface UtilsService {
    @ResponseBody
    @RequestMapping(value = "/utils/date/dateFormat")
    R dateFormat(@RequestParam("dateFormat") String dateFormat ,@RequestParam("timeZone") Integer timeZone);
}
