package com.java.Impl;

import com.java.interfaces.Phone;

public class PhoneProxy implements Phone {
    private Phone phone;
    public PhoneProxy(Phone proxyPhone) {
        this.phone = proxyPhone;
    }
    @Override
    public void call() {
        System.out.println("拨通电话");
        phone.call();
        System.out.println("挂断电话");
    }

    public static void main(String[] args) {
        Phone huawei = new Huawei();
        PhoneProxy phoneProxy = new PhoneProxy(huawei);
        phoneProxy.call();
    }
}
