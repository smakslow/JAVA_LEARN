package com.smalsow.juc.chart1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest {
     static  class MyThread extends Thread{

         @Override
         public void run() {
             System.out.println("I am a extend thread");
         }
     }

     static class RunnableTask implements Runnable{

         @Override
         public void run() {
             System.out.println("I am a runnable thread");
         }
     }

     static  class CallerTask implements Callable<String>{

         @Override
         public String call() throws Exception {
             return "hello callable";
         }
     }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        new Thread(new RunnableTask()).start();

        FutureTask<String> futureTask = new FutureTask<>(new CallerTask());
        new Thread(futureTask).start();
        String result = futureTask.get();
        System.out.println(result);
    }
}
