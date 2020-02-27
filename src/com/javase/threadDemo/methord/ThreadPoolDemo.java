package com.javase.threadDemo.methord;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadPoolDemo {
    private static int POOL_SIZE = 10;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i = 0; i < POOL_SIZE; i++) {
            RunnableThread runnableThread = new RunnableThread();
            executorService.execute(runnableThread);

        }
        executorService.shutdown();
        Lock lock = new ReentrantLock();
        lock.lock();
    }

}
class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("通过线程池方式创建的线程：" + Thread.currentThread().getName() + " ");

    }
}
