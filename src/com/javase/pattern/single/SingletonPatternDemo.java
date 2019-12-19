package com.javase.pattern.single;

/**
 * 单例模式
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject instance = SingleObject.getInstance();
        instance.showMessage();
    }
}
