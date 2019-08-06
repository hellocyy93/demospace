package com.javase;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
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
    @Test
    public void entrySetPritice () {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("www.goole.com", "谷歌");
        hashMap.put("www.alibaba.com", "阿里巴巴");
        hashMap.put("www.baidu.com", "百度");
        System.out.println("第一种遍历map集合方法: 使用keySet获取所有的Key");
        for (String key : hashMap.keySet()) {
            System.out.println("key: " + key + " value: " + hashMap.get(key));
        }
        System.out.println("第二种遍历map集合方法: 使用Map.entrySet获取所有的元素，然后使用iterator遍历");
        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
        System.out.println("第三种遍历map集合方法: 使用Map.entrySet获取所有的元素，然后使用foreach遍历");
        for (Map.Entry<String, String> mapEntry :hashMap.entrySet()) {
            System.out.println("key: " + mapEntry.getKey() + " value: " + mapEntry.getValue());
        }
        System.out.println("第四种遍历map集合方法: 直接使用values获取到所有的值，该种方式无法遍历Key");
        for (String value : hashMap.values()) {
            System.out.println("value: " + value);
        }
    }
}
