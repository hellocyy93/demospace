package com.java.Impl;

public class CglibTest {
    public static void main(String[] args) {
        Huawei huawei = new Huawei();
        Huawei proxyInstance = (Huawei) new CglibProxy(huawei).getProxyInstance();
        proxyInstance.call();
    }
}
