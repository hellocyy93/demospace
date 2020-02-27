package com.javase.generic.test;

import java.util.ArrayList;
import java.util.List;

public class DemoAcition {
    public static void main(String[] args) {
        /*Demo<Integer> objectDemo = new Demo<Integer>();
        objectDemo.setFiled(121);
        System.out.println(objectDemo.getFiled());*/
        Demo demo = new Demo();
       /* List<String> list = demo.newArrayList();
        list.add("www.goole.com");
        list.add("goole");
        for (String str : list) {
            System.out.println(str);
        }
*/
      /* demo.showClass(123);
       demo.showClass("nihao");*/
    /*    List<String> listStr = new ArrayList<String>();
        listStr.add("abc");
        demo.show(listStr);
        List<Long> listLong = new ArrayList<Long>();
        listLong.add(123L);
        demo.show(listLong);*/
        //demo.actionClass(121);
        List<? extends Fruit> list = new ArrayList<Fruit>();

        List<? extends Fruit> listN = new ArrayList<Apple>();

        List<? super Fruit> listS = new ArrayList<Fruit>();
        List<? super Fruit> listA = new ArrayList<Food>();

        List<String>l1 = new ArrayList<String>();
        List<Integer>l2 = new ArrayList<Integer>();
        System.out.println(l1.getClass() == l2.getClass());

    }
    class Food {}

    class Fruit extends Food {}

    class Apple extends Fruit {}
}
