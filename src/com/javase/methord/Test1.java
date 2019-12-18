package com.javase.methord;

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
        System.out.println(transProp("0"));
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
        if ("0".equals(accountProp)) {
            return "C";
        } else {
            return "P";
        }
    }
}
