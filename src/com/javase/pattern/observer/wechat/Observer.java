package com.javase.pattern.observer.wechat;

/**
 * 定义一个观察者接口
 */
public interface Observer {
    public void update(String message);// 当被观察者发出通知时，这个方法就会执行
}
