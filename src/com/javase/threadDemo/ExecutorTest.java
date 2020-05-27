package com.javase.threadDemo;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorTest {
    public static void main(String[] args) {
        //线程最大空闲时间 keepAliveTime 等待队列
        ThreadPoolExecutor pool = new ThreadPoolExecutor(5, 8,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(2));
        int a = 12;
        for (int i = 0; i < a; i++) {
            int j = i;
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    //获取线程名称
                    Thread thread = Thread.currentThread();
                    String name = thread.getName();
                    //输出
                    int activeCount = pool.getActiveCount();

                    System.out.println("任务--"+j+"======,线程名称:"+name+"=======活跃线程数:"+activeCount);
                }
            });
        }

    }
}
