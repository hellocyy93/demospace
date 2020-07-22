package com.javase.mapTest;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {
    public static void main(String[] args) {
        //HashMap<String, String> map = new HashMap<>();
      /*  map.put("1","one");
        map.put("2","two");
        map.put("3","three");*/
       /* for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "===" + entry.getValue());
        }*/
       // System.out.println(map.get("4"));
        System.out.println(System.currentTimeMillis());
    }
    @Test
    public void doubleMap() {
        Map map = new HashMap<String, String>();
        map.put("requestTime", "123456");
        map.put("orgCode", "test000");
        map.put("accessSignature", "");
        map.put("accessToken", "");
        map.put("flowId", "123456");
        Map mapF = new HashMap<>();
        mapF.put("contractId", "123456");
        mapF.put("productNo", "123456");
        mapF.put("pmtTerm", "12");
        mapF.put("actPmtCap", "1200000.00");
        mapF.put("actPmtItr", "0.00");
        mapF.put("actPmtTotal", "1200000.00");
        mapF.put("actPmtDate", "123456");
        map.put("reqParam", mapF);
        System.out.println(JSON.toJSONString(map));
    }

    @Test
    public void concurrentHashMapTest() {
        ConcurrentHashMap<Object, Object> map = new ConcurrentHashMap<>();
        map.put("001", "特朗普");
        System.out.println(map.get("001"));
    }
}
