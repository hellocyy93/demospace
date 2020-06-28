package com.javase.test;

import com.java.beans.City;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NullTest {
    public static City city;
    @Test
    public void testdemo() {
        if ("1" == city.getCode()) {
            System.out.println("1111111111111111111");
        } else {
            System.out.println(city.getCode());
        }
    }

    @Test
    public void testdemo2() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd ");
        String s = "2011-07-09 ";
        Date date = formatter.parse(s);
        System.out.println(formatter.format(date));
    }
    public static void main(String[] args) {
        if ("1" == city.getCode()) {
            System.out.println("1111111111111111111");
        } else {
            System.out.println(city.getCode());
        }
    }
    @Test
    public void testdemo3() throws ParseException {
     /*   List<Phone> list1 = new ArrayList<>();
        List<Phone> list2 = null;
        System.out.println(list1);
        System.out.println(list2);*/
      /*  String str = "[123,456]";
        String s = str.replace("[", "").replace("]", "");
        System.out.println(s);*/
        String orgCodeListStr = "15032&,15032&1&";
        StringBuffer sb = new StringBuffer("");
        sb.append(" and  pc.org_code in ('"+ orgCodeListStr.replaceAll(",","','") + "')");
        System.out.println(sb);

    }


}
