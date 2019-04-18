package com.javase.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("2019-04-30");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cr = Calendar.getInstance();
        cr.setTime(date);
        int year = cr.get(Calendar.YEAR);
        int month = cr.get(Calendar.MONTH);
        int day = cr.get(Calendar.DAY_OF_MONTH);
        System.out.println("年:" + year + ",月:" + month + ",日:" + day);
        cr.set(year, month, 28);
        Date time = cr.getTime();
        int days = cr.get(Calendar.DAY_OF_MONTH);
        System.out.println(time);
        System.out.println(days);
    }
}
