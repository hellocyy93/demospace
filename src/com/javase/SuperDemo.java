package com.javase;

public class SuperDemo {
    public static void prt(String s) {
        System.out.println(s);
    }

    SuperDemo() {
        prt("父类·无参数构造方法： "+"A Person.");
    }//构造方法(1)

    SuperDemo(String name) {
        prt("父类·含一个参数的构造方法： "+"A person's name is " + name);
    }//构造方法(2)
    SuperDemo(String name, String id) {
        prt("父类·含两个参数的构造方法： "+"A person's name is " + name);
    }//构造方法(2)
}
