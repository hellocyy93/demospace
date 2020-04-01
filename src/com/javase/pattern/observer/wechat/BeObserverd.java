package com.javase.pattern.observer.wechat;
/**
 * 定义一个被观察者接口
 */
public interface BeObserverd {
    public void registerObserver(Observer o);// 添加观察者
    public void removeObserver(Observer o);// 删除观察者
    public void notifyObserver();// 通知观察者
}
