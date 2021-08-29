package com.smakslow.juc.chart1;

import java.util.stream.IntStream;

public class ThreadDemo1 {
    public static class Mythread extends Thread {
        @Override
        public void run() {
            super.run();
            System.out.println(String.format("当前执行的线程是： %s , 优先级： %d", Thread.currentThread().getName(), Thread.currentThread().getPriority()));
        }
    }

    public static void main(String[] args) {
        IntStream.range(1, 10).forEach(i -> {
            Thread thread = new Thread(new Mythread(), "thread" + i);
            thread.setPriority(i);
            thread.start();
        });


        //如果某个线程优先级?于线程所在线程组的最?优先级，那么该线程的优先
        //级将会失效，取?代之的是线程组的最?优先级
        ThreadGroup test = new ThreadGroup("test");
        test.setMaxPriority(5);
        Thread thread = new Thread(test, "p");
        thread.setPriority(10);
        System.out.println(thread.getState());
        thread.start();
        System.out.println("线程的优先级 " + thread.getPriority());
        System.out.println(thread.getState());
        System.out.println("线程组的优先级 " + test.getMaxPriority());
        thread.start();
    }
}
