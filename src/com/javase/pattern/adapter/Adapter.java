package com.javase.pattern.adapter;

public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("这是method2方法");
    }
}
