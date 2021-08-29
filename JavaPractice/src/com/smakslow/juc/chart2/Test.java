package com.smakslow.juc.chart2;

public class Test {
    static class A implements Runnable {
        int num;

        public A(int num) {
            this.num = num;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("Sloution £º" + num);
                num++;
            }
        }
    }

    static class B implements Runnable {
        int num;

        public B(int num) {
            this.num = num;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("B £º" + num);
                num++;
            }
        }
    }

    public static void main(String[] args) {
        int num = 0;
        Thread thread1 = new Thread(new A(num));
        Thread thread2 = new Thread(new B(num));
        StringBuilder builder = new StringBuilder();
        thread1.start();
        thread2.start();
    }
}
