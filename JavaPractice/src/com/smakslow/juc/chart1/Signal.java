package com.smakslow.juc.chart1;

public class Signal {
    /*volitile�ؼ����ܹ���֤�ڴ�Ŀ�?�ԣ����?volitile�ؼ���������?����
������?���߳�??�ı������������ֵ���������߳���??��?���ĺ��
ֵ�ġ�*/
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
/*ʹ?��?�� volatile ���� signal ��ʵ���ˡ��ź�������ģ�͡���?
��Ҫע����ǣ� volatile ������Ҫ��?ԭ?������ signal++ ������?��ԭ?��
��������������Ҫʹ? synchronized ��������������*/
    public static void main(String[] args) throws InterruptedException {
        new Thread(new ThreadA()).start();
        Thread.sleep(1000);
        new Thread(new ThreadB()).start();
    }
}
