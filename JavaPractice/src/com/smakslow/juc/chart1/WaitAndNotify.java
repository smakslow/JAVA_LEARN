package com.smakslow.juc.chart1;

public class WaitAndNotify {
    /*�����Demo?���߳�LCP39���߳�B?�ȴ�ӡ��??��Ҫ�Ķ�?��Ȼ��ʹ
    ? notify() ?��������?�����ڵȴ����̣߳�Ȼ��??ʹ? wait() ?����?�ȴ�
    ���ͷ� lock ����
    ��Ҫע����ǵȴ�/֪ͨ����ʹ?����ʹ?ͬ?��������������������߳�ʹ
    ?���ǲ�ͬ�Ķ�������������֮���ǲ���?�ȴ�/֪ͨ����ͨ�ŵġ�*/
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
