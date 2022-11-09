package com.shanzhu.controller;

import com.shanzhu.conf.ApiException;
import com.shanzhu.entity.DbVo;
import com.shanzhu.utils.R;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author shanzhu
 * @description
 * @create 2022/11/7
 */
@RestController
@RequestMapping(value = "/generate")
public class GenerateController {
    @RequestMapping(value = "/DB",method = RequestMethod.GET)
    public R generateDb(@RequestBody DbVo vo){

        return R.ok();
    }
}
