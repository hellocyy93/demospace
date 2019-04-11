package com.java.common;

public abstract class CommonPhone {
    public abstract Object process(String str);

    public void service (String s) {
        System.out.println( "service开始执行...");
        Object obj = process(s);
        System.out.println(obj +  "service结束执行...");
    }

}
