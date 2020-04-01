package com.javase.pattern.observer.wechat;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者，也就是微信公众号服务实现了BeObserverd接口，
 * 对BeObserverd接口的三个方法进行了具体实现
 */
public class WechatServer implements BeObserverd{
    private List<Observer> list;
    private String message;
    public WechatServer() {
        list = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (!list.isEmpty()) {
            list.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < list.size(); i++) {
            Observer observer = list.get(i);
            observer.update(message);
        }
    }
    // 模拟公众号推送消息的方法
    public void setInfomation(String s) {
        this.message = s;
        System.out.println("微信服务更新消息： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }
}
