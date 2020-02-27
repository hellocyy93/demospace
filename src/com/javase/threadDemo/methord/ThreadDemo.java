package com.javase.threadDemo.methord;

public class ThreadDemo extends Thread{

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.setName("ThreadDemo");
        threadDemo.start();
        System.out.println(Thread.currentThread().toString());

    }
}
