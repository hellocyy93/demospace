package com.javase.threadDemo.methord;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableDemo {
    public static void main(String[] args) {
        Callable<Object> myCallable = new Tickets<Object>();
        FutureTask<Object> objectFutureTask = new FutureTask<Object>(myCallable);

        Thread thread1 = new Thread(objectFutureTask);
        System.out.println(Thread.currentThread().getName()+"=>My main");
        thread1.start();
    }
}
class Tickets<Object> implements Callable<Object> {

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"=>My Callable");
        return null;
    }
}