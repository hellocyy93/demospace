package com.javase;

import java.util.HashMap;

public class SonDemo extends SuperDemo {
    SonDemo() {
        super(); // 调用父类构造方法（1）
        prt("子类·调用父类”无参数构造方法“： "+"A chinese coder.");
    }

 /*   //Chinese(String name) {
  *//*      super(name);// 调用父类具有相同形参的构造方法（2）
        prt("子类·调用父类”含一个参数的构造方法“： "+"his name is " + name);
    }

    Chinese(String name, int age) {
        this(name);// 调用具有相同形参的构造方法（3）
        prt("子类：调用子类具有相同形参的构造*//*方法：his age is " + age);
    }*/

    public static void main(String[] args) {
        //SonDemo cn = (SonDemo) new SuperDemo();
//        cn = new SonDemo("codersai");
        //cn = new Chinese("codersai", 18);
        SuperDemo superDemo = new SuperDemo();
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("001", superDemo);
        System.out.println(map.get("001"));
    }
}
