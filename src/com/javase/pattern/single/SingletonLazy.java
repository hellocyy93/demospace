package com.javase.pattern.single;

/**
 * 懒汉式
 */
public class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy(){}
    //加synchronized线程安全
    public static synchronized  SingletonLazy getInstance() {
        if (instance == null) {
            return instance = new SingletonLazy();
        }
        return instance;
    }
}
