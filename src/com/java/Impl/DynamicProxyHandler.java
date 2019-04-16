package com.java.Impl;

import com.java.interfaces.Phone;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author chenyy
 * @version V1.0.0
 * @description:动态代理练习
 */
public class DynamicProxyHandler implements InvocationHandler {
    private Object object;
    public DynamicProxyHandler(final Object proxy) {
        this.object = proxy;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("拨通电话");
        Object invoke = method.invoke(object, args);
        System.out.println("挂断电话");
        return invoke;
    }

    public static void main(String[] args) {
        Phone huawei = new Huawei();
        Phone phoneProxy = (Phone)Proxy.newProxyInstance(Phone.class.getClassLoader(),new Class[] {Phone.class},
                new DynamicProxyHandler(huawei));
        phoneProxy.call();

    }
}
