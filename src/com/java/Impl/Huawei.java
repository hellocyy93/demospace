package com.java.Impl;

import com.java.interfaces.Phone;

public class Huawei implements Phone {
    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }

    public static void main(String[] args) {
        Phone huawei = new Huawei();
        huawei.call();
    }
    public void callbbb() {
        System.out.println("callbbb");
    }
    public void testcall333() {
        System.out.println("testcall333");
    }
}
