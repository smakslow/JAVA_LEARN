package com.smalsow.javapractice.chart2;

import org.junit.Test;

public class ThreadTest {
    private static int i = 100;
   private int count = 0;
    @Test
    public void test1() {
        Thread thread1 = new Thread(() -> {
            for (; i > 0; i--) {
                System.out.println("Thread1  " +i);
                count ++ ;
                System.out.println("count " +count);
            }
        });


        Thread thread2 = new Thread(() -> {
            for (; i > 0; i--) {
                System.out.println("Thread2  " +   i);
                count++;
                System.out.println("count " +count);
            }
        });


        thread1.start();
        thread2.start();

    }
}
