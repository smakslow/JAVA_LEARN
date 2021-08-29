package com.smakslow.juc.chart1;

/**
 * @ClassName: VolatileTest
 * @Description: volatile �ڴ�ɼ��Բ���
 * @date: 2018��8��31�� ����10:35:33
 */
public class VolatileTest extends Thread {
    // ֹͣ�߳�
    private volatile boolean stopThread = false;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " -- run()");
        int i = 0;
        while (!stopThread) {
            // System.out.println(Thread.currentThread().getName()+"�����У�"+i);
            i++;
        }
        // �߳�ֹͣ���ӡi
        System.out.println(i);
    }

    public void stopThread() {
        System.out.println(Thread.currentThread().getName() + " -- stopThread()");
        stopThread = true;
    }

    /**
     * @Title: main
     * @Description: volatile �ڴ�ɼ��Բ���
     * @param args
     */
    public static void main(String[] args) {
        VolatileTest thread = new VolatileTest();
        thread.start(); // �߳�������ִ��run����
        try {
            Thread.sleep(500);
            thread.stopThread();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
