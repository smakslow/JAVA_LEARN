package com.smakslow.juc.chart1;

public class SynchronizedTest {
    private static volatile Object resA = new Object();
    private static volatile Object resB = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resA) {
                    System.out.println("threadA get resA lock");
                    synchronized (resB) {
                        System.out.println("threadA get resB lock");
                        System.out.println("threadA release resA lock");
                        try {
                            resA.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (resA) {
                        Thread.sleep(1000);
                        System.out.println("threadB get resA lock");
                        System.out.println("threadB try get resB lock >>>");
                        synchronized (resB) {
                            System.out.println("threadB get resB lock");
                            System.out.println("threadB release resA lock");

                            resA.wait();

                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        );

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();
    }
}
