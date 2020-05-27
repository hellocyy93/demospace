package com.javase.test;

import com.java.beans.City;
import com.java.interfaces.Phone;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
        List<Phone> list1 = new ArrayList<>();
        List<Phone> list2 = null;
        System.out.println(list1);
        System.out.println(list2);
    }


}
