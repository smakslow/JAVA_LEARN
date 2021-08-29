package com.smakslow.juc.chart8;

import java.util.concurrent.*;

public class ThreadPoll {
    private static int a = 0;
    /*
    * 线程池核心参数
    *
    * */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Class<ThreadPoolExecutor> threadPoolExecutorClass = ThreadPoolExecutor.class;
        //ExecutorService executorService = Executors.newFixedThreadPool(120);
        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
           /* Future<?> submit = executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " " + (a++));
                }
            });
            System.out.println(submit.get());*/


            Future<String> submit1 = executorService.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return Thread.currentThread().getName() + " " + (a++);
                }
            });
            System.out.println(submit1.get());
        }


    }
}
