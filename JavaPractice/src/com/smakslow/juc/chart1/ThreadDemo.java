package com.smakslow.juc.chart1;

import java.util.concurrent.*;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread testThread = new Thread(() -> {
            System.out.println("testThread��ǰ�߳�������" +
                    Thread.currentThread().getThreadGroup().getName());
            System.out.println("testThread�߳�����" +
                    Thread.currentThread().getName());
        });
        testThread.setPriority(10);
        testThread.start();
        System.out.println(testThread.getPriority());
        System.out.println("ִ��main�����߳�����" + Thread.currentThread().getName());


        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<String> submit = executorService.submit(() -> "hello");
        System.out.println(submit.get());
    }
}
