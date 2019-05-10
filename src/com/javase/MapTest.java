package com.javase;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        /*HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "JackMa");
        map.put("2", "PonyMa");
        map.put("3", "FarChen");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }*/
       /* ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("5");
        list.add("3");
        list.add("4");
        for (String str1 : list) {
            System.out.printf(str1 + ",");
        }
        System.out.println();
        Collections.sort(list);
        for (String str2 : list) {
            System.out.printf(str2 + ",");
        }*/
      /*  HashMap<String, String> map = new HashMap<String, String>();
        map.put("Beijing", "北京");
        map.put("Shanghai", "上海");
        map.put("Guangzhou", "广州");
        map.put("Shenzhen", "深圳");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
*/
        Map map = new HashMap<String,String>();//创建一个map
        map.put("key","value");//给map赋值
        Object val = map.get("key");//获取map中键值为“key”的值
        System.out.println(val);//输出结果
    }
}
