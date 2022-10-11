package com.atguigu.converter;


import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-10-03
 */
public class MyDateConvert implements Converter<String, Date> {

    private String pattern;

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /*
    convert的作用： String  --->>> Date
                   SimpleDateFormat sdf = new SimpleDateFormat();
                   sdf.parse(String) --->>> Date
    param:source 代表的是配置文件中日期字符串，<value>2022-10-03</value>
    return: 当把转换好的Date作为convert方法的返回值后，Spring自动的为birthday属性进行注入
     */

    @Override
    public Date convert(String source) {
        Date date = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            date = sdf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
