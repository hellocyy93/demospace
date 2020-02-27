package com.javase.threadDemo.methord;

public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "->my");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "->main");
        Thread thread1 = new Thread(new RunnableDemo());
        thread1.start();
    }
}
