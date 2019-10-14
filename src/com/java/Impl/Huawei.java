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
    public void testcall444() {
        System.out.println("testcall444");
    }
    public void testcall555() {
        System.out.println("testcall555");
    }
}
