package com.javase.listDemo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
      /*  arrayList.add("aa");
        arrayList.add("bb");
        arrayList.add("ccb");
        arrayList.add("cca");
        String temp = null;*/
        for (String str : arrayList) {
     /*       if (null == temp && str.contains("cc")) {
                continue;
            }*/
            System.out.println(str);
        }
        //System.out.println(temp);
     /*   BigDecimal num1 = new BigDecimal("100.50000");
        BigDecimal num2 = new BigDecimal("10000.000");
        System.out.println(num1.add(num2).setScale
                (2, BigDecimal.ROUND_HALF_UP));*/
    }
    @Test
    public void listTest() {
        List list = new ArrayList<>();
        list.add(1);
        System.out.println(list.get(0));
    }
}
