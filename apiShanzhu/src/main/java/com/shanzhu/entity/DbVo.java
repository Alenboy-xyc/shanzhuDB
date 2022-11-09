package com.shanzhu.entity;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shanzhu
 * @description
 * @create 2022/11/7
 */
@Data
public class DbVo {
    //表名
    private String name;
    //字段(字段名，类型)
    private Map<String,Object> columns = new HashMap<>();
    //mybatis还是mybatis-plus
    private Integer isMybatis;
    //是否需要构造器
    private Boolean isConstructor;
    //构造器字段
    private List<String> columnsConstructor = new ArrayList<>();
    //是否生成controller
    private Boolean isController;
    //是否生成service
    private Boolean isService;
    //是否生成mapper
    private Boolean isMapper;
}
