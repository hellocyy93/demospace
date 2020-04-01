package com.javase.pattern.observer.wechat;

public class WeChatTest {
    public static void main(String[] args) {
        WechatServer server = new WechatServer();
        User user = new User("消息观察者-user");
        server.registerObserver(user);
        server.setInfomation("欢迎订阅");

    }
}
