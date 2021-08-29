package com.smakslow.interview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class D {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        //ThreadFactory threadFactory = Executors.defaultThreadFactory();
        for (int i = 0; i < 100; i++) {
            executorService.execute(new Task());
        }
    }
}

class  Task implements Runnable{

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
