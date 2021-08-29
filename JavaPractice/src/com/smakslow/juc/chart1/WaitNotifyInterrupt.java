package com.smakslow.juc.chart1;

public class WaitNotifyInterrupt {
    static Object obj =  new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("----- begin -----");
                synchronized (obj) {
                    obj.wait();//线程调用共享对象的wait()方法被阻塞挂起
                }
                System.out.println("------ end ----");
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        });

        thread.start();
        Thread.sleep(1000);

        System.out.println("-------begin interrupt thread");
        thread.interrupt();  //中断线程
        System.out.println("-------end interrupt thread");
    }
}
