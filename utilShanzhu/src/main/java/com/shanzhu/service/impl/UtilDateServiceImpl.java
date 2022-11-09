package com.shanzhu.service.impl;

import com.shanzhu.service.UtilDateService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author shanzhu
 * @description
 * @create 2022/11/8
 */
@Service
public class UtilDateServiceImpl implements UtilDateService {
    @Override
    public long getTimeStampByDate(String dateFormat, Integer timeZone) {
        long timeStamp = 0;
        try {
            Calendar instance = Calendar.getInstance();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = format.parse(dateFormat);
            instance.setTime(date);
            instance.setTimeZone(getTimezone(timeZone));
            timeStamp = instance.getTimeInMillis();
        }catch (Exception e){
            e.printStackTrace();
        }
        return timeStamp;
    }
    public static TimeZone getTimezone(int timezone) {
        if (timezone < 0) {
            return TimeZone.getTimeZone("GMT-" + (-timezone));
        } else {
            return TimeZone.getTimeZone("GMT+" + timezone);
        }
    }
}
