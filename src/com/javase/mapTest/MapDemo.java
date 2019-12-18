package com.javase.mapTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1","one");
        map.put("2","two");
        map.put("3","three");
        List<String> list = new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");
        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("=============================");
            System.out.println(list.get(Integer.parseInt(entry.getKey()) - 1));
        }
    }
}
