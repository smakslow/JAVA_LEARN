package com.smakslow.juc.chart1;

public class WaitNotifyInterrupt {
    static Object obj =  new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("----- begin -----");
                synchronized (obj) {
                    obj.wait();//�̵߳��ù�������wait()��������������
                }
                System.out.println("------ end ----");
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        });

        thread.start();
        Thread.sleep(1000);

        System.out.println("-------begin interrupt thread");
        thread.interrupt();  //�ж��߳�
        System.out.println("-------end interrupt thread");
    }
}
