package com.smakslow.juc.chart1;

import java.util.stream.IntStream;

public class ThreadDemo1 {
    public static class Mythread extends Thread {
        @Override
        public void run() {
            super.run();
            System.out.println(String.format("��ǰִ�е��߳��ǣ� %s , ���ȼ��� %d", Thread.currentThread().getName(), Thread.currentThread().getPriority()));
        }
    }

    public static void main(String[] args) {
        IntStream.range(1, 10).forEach(i -> {
            Thread thread = new Thread(new Mythread(), "thread" + i);
            thread.setPriority(i);
            thread.start();
        });


        //���ĳ���߳����ȼ�?���߳������߳������?���ȼ�����ô���̵߳�����
        //������ʧЧ��ȡ?��֮�����߳������?���ȼ�
        ThreadGroup test = new ThreadGroup("test");
        test.setMaxPriority(5);
        Thread thread = new Thread(test, "p");
        thread.setPriority(10);
        System.out.println(thread.getState());
        thread.start();
        System.out.println("�̵߳����ȼ� " + thread.getPriority());
        System.out.println(thread.getState());
        System.out.println("�߳�������ȼ� " + test.getMaxPriority());
        thread.start();
    }
}
