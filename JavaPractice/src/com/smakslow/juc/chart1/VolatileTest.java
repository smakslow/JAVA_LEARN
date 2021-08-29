package com.smakslow.juc.chart1;

/**
 * @ClassName: VolatileTest
 * @Description: volatile 内存可见性测试
 * @date: 2018年8月31日 下午10:35:33
 */
public class VolatileTest extends Thread {
    // 停止线程
    private volatile boolean stopThread = false;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " -- run()");
        int i = 0;
        while (!stopThread) {
            // System.out.println(Thread.currentThread().getName()+"运行中："+i);
            i++;
        }
        // 线程停止后打印i
        System.out.println(i);
    }

    public void stopThread() {
        System.out.println(Thread.currentThread().getName() + " -- stopThread()");
        stopThread = true;
    }

    /**
     * @Title: main
     * @Description: volatile 内存可见性测试
     * @param args
     */
    public static void main(String[] args) {
        VolatileTest thread = new VolatileTest();
        thread.start(); // 线程启动并执行run方法
        try {
            Thread.sleep(500);
            thread.stopThread();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
