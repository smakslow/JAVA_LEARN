package com.smakslow.juc.chart1;

import java.util.concurrent.*;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread testThread = new Thread(() -> {
            System.out.println("testThread当前线程组名字" +
                    Thread.currentThread().getThreadGroup().getName());
            System.out.println("testThread线程名字" +
                    Thread.currentThread().getName());
        });
        testThread.setPriority(10);
        testThread.start();
        System.out.println(testThread.getPriority());
        System.out.println("执行main方法线程名字" + Thread.currentThread().getName());


        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<String> submit = executorService.submit(() -> "hello");
        System.out.println(submit.get());
    }
}
