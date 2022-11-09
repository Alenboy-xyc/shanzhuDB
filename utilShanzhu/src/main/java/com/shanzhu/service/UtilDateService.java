package com.shanzhu.service;

import java.text.ParseException;

/**
 * @author shanzhu
 * @description
 * @create 2022/11/8
 */
public interface UtilDateService {
    /**
     * 获取给定日期的时间戳
     * @param dateFormat 时间戳
     * @param timeZone 时区
     * @return
     */
    long getTimeStampByDate(String dateFormat, Integer timeZone) throws ParseException;
}
