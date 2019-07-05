package com.javase.test;

import java.util.ArrayList;
import java.util.List;

public class MapTest {
    public static void main(String[] args) {
//        HashMap<String, String> map = new HashMap<>();
//        map.put("1","上海");
//        map.put("2","东京");
//        map.put("3","纽约");
//       for(Map.Entry<String, String> entry : map.entrySet()) {
//           System.out.println(entry.getKey() + "::" + entry.getValue());
//       }

        List<String> list = new ArrayList<>();
        //list.add("张三");
        list.add("李四");
       // list.add("王五");
        list.add("赵六");

        for (int i = 0;i<list.size();i++){

            list.remove(i);
        }

        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
