package com.javase.pattern.single;

/**
 * 饿汉式
 */
public class SingletonHunger {
    private static SingletonHunger instance  = new SingletonHunger();
    private SingletonHunger() {}
    public static SingletonHunger getInstance() {
        return instance;
    }
}
