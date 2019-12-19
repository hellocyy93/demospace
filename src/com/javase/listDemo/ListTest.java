package com.javase.listDemo;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("aa");
        arrayList.add("bb");
        arrayList.add("ccb");
        arrayList.add("cca");
        String temp = null;
        for (String str : arrayList) {
            if (null == temp && str.contains("cc")) {
                temp = "hello";
                System.out.println(str);
            }
        }
        System.out.println(temp);
    }
}
