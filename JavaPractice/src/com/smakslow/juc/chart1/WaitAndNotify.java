package com.smakslow.juc.chart1;

public class WaitAndNotify {
    /*在这个Demo?，线程A和线程B?先打印出??需要的东?，然后使
    ? notify() ?法叫醒另?个正在等待的线程，然后??使? wait() ?法陷?等待
    并释放 lock 锁。
    需要注意的是等待/通知机制使?的是使?同?个对象锁，如果你两个线程使
    ?的是不同的对象锁，那它们之间是不能?等待/通知机制通信的。*/
    private static Object lock = new Object();

    static class ThreadA implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println("ThreadA: " + i);
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify();
            }
        }
    }

    static class ThreadB implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println("ThreadB: " + i);
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(new ThreadA()).start();
        Thread.sleep(1000);
        new Thread(new ThreadB()).start();
    }
}
