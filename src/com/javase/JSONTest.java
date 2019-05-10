package com.javase;

import com.alibaba.fastjson.JSON;
import com.java.beans.City;

public class JSONTest {

    public static void main(String[] args) {
       /* City city = new City("上海", "002", "魔都");
        String jsonString = JSON.toJSONString(city);
        System.out.println("简单java类转json字符串: " + jsonString);*/

        String jsonString2 = "{'name' : '北京', 'code' : '001', 'desc' : '帝都'}";
        City city2 = JSON.parseObject(jsonString2, City.class);
        System.out.println("json字符串转简单java对象: "+city2.toString());
    }

}
