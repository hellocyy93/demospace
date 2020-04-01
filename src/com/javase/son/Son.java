package com.javase.son;

import com.javase.father.Father;

public class Son extends Father {
    public static void main(String[] args) {
        Son son = new Son();
        son.say();
        sing();
    }
    public static void sing() {
        System.out.println("lalala");
    }
}
