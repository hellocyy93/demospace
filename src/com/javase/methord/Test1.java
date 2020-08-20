package com.javase.methord;

import com.java.beans.Bens;
import com.java.beans.City;
import org.junit.Test;

public class Test1 {
    int i = 1;
    String str = "nihao";
    @Test
    public void demo() {
       /* int y = doSum(i,str);
        System.out.println(y);
        System.out.println(str);*/
       /* City city = new City();
        city.setCode("001");
        city.setName("北京");
        getCity(city);
        System.out.println(city);*/
        //System.out.println(transProp("0"));
        //transProp("0");
        testNull();
        System.out.println("===================");

    }

    private void testNull() {
        int i = 1;
        if (i == 1) {
            return;
        }
        System.out.println("void");
    }

    private void getCity(City city) {
        city.setCode("002");
        city.setName("上海");
       // return city;
    }

    private int doSum(int i, String str) {
        str = "hello";
        return i+1;
    }

    private String transProp(String accountProp) {
        System.out.println(accountProp);
        if ("0".equals(accountProp)) {
            return "C";
        } else {
            return "P";
        }
    }
    public static void main(String[] args) {
        //获取指定时间的时间戳，除以1000说明得到的是秒级别的时间戳（10位）
      /*  long time = new Date().getTime() ;

        System.out.println("获取指定时间的时间戳:" + time);*/
        Bens car = null;
        car.setBrand("benchi");
        System.out.println(car.getBrand());

    }
}
