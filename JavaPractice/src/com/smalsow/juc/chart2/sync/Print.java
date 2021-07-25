package com.smalsow.juc.chart2.sync;

public class Print {
    private  int num = 0;

    public  synchronized  void odd() throws InterruptedException {
        if(num % 2 == 0){
            this.wait();
        }
        num++;
        System.out.println(Thread.currentThread().getName() + "::" + num);
        this.notifyAll();
    }
    public  synchronized  void even() throws InterruptedException {
        if(num % 2 != 0){
            this.wait();
        }
        num++;
        System.out.println(Thread.currentThread().getName() + "::" + num);
        this.notifyAll();
    }

    public static void main(String[] args) {
        Print print = new Print();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    try {
                        print.odd();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"odd").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    try {
                        print.even();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"even").start();
    }
}
