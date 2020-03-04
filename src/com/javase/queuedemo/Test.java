package com.javase.queuedemo;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
     /*   ArrayList<Object> list = new ArrayList<>();
        list.add("c");
        list.add("b");
        list.add("a");
        for (Object object : list) {
            System.out.println(object);
        }
        LinkedList<Object> objects = new LinkedList<>();*/
       Queue<String> queue = new LinkedList<String>();

        /**
         * 他们的共同之处是建议实现类禁止添加 null 元素，否则会报空指针 NullPointerException；
         * 不同之处在于 add() 方法在添加失败（比如队列已满）时会报 一些运行时错误 错；而 offer()
         * 方法即使在添加失败时也不会奔溃，只会返回 false。
         *
         */
        // offer add
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("============================");
        //poll remove
        System.out.println("poll=" + queue.poll());
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("============================");
        //peek element
        System.out.println("peek=" + queue.element());
        for(String q : queue){
            System.out.println(q);
        }


    }
}
