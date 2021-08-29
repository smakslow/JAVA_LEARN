package com.smakslow.juc.chart1;

public class Signal {
    /*volitile关键字能够保证内存的可?性，如果?volitile关键字声明了?个变
量，在?个线程??改变了这个变量的值，那其它线程是??可?更改后的
值的。*/
    private static volatile int signal = 0;

    static class ThreadA implements Runnable {
        @Override
        public void run() {
            while (signal < 5) {
                if (signal % 2 == 0) {
                    System.out.println("threadA: " + signal);
                    synchronized (this) {
                        signal++;
                    }
                }
            }
        }
    }

    static class ThreadB implements Runnable {
        @Override
        public void run() {
            while (signal < 5) {
                if (signal % 2 == 1) {
                    System.out.println("threadB: " + signal);
                    synchronized (this) {
                        signal = signal + 1;
                    }
                }
            }
        }
    }
/*使?了?个 volatile 变量 signal 来实现了“信号量”的模型。这?
需要注意的是， volatile 变量需要进?原?操作。 signal++ 并不是?个原?操
作，所以我们需要使? synchronized 给它“上锁”。*/
    public static void main(String[] args) throws InterruptedException {
        new Thread(new ThreadA()).start();
        Thread.sleep(1000);
        new Thread(new ThreadB()).start();
    }
}
