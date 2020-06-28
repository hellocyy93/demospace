package com.javase.generic;

import org.junit.Test;

public class ObjectAndT {
    @Test
    public void test1() {
        // 定义泛型类Gen的一个Integer版本
        Gen<Integer> intOb = new Gen<Integer>(88);
        intOb.showType();
        int i = intOb.getOb();
        System.out.println("value= " + i);
        System.out.println("----------------------------------");
        // 定义泛型类Gen的一个String版本
        Gen<String> strOb = new Gen<String>("Hello Gen!");
        strOb.showType();
        String s = strOb.getOb();
        System.out.println("value= " + s);
    }

    @Test
    public void test2() {
        //定义类Gen2的一个Integer版本
        Gen2 intOb = new Gen2(new Integer(88));
        intOb.showTyep();
        String i = (String) intOb.getOb();
        System.out.println("value= " + i);
        System.out.println("---------------------------------");
        //定义类Gen2的一个String版本
        Gen2 strOb = new Gen2("Hello Gen!");
        strOb.showTyep();
        String s = (String) strOb.getOb();
        System.out.println("value= " + s);
    }
}
class Gen<T> {
    private T ob; // 定义泛型成员变量

    public Gen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }

    public void showType() {
        System.out.println("T的实际类型是: " + ob.getClass().getName());
    }
}

class Gen2 {
    private Object ob; //定义一个通用类型成员
    public Gen2(Object ob) {
        this.ob = ob;
    }
    public Object getOb() {
        return ob;
    }
    public void setOb(Object ob) {
        this.ob = ob;
    }
    public void showTyep() {
        System.out.println("T的实际类型是: " + ob.getClass().getName());
    }
}

