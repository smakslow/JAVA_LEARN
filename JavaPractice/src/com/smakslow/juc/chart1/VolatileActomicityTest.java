package com.smakslow.juc.chart1;

/**
 * @ClassName: VolatileActomicityTest
 * @Description: volatile �ڴ�ԭ���Բ���
 * @date: 2018��8��31�� ����10:35:33
 */
public class VolatileActomicityTest {

    private volatile static int count = 0;

    /**
     * @Title: main
     * @Description: volatile �ڴ�ɼ��Բ���
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Runnable r = () -> {
                for (int j = 0; j < 1000; j++) {
                    count++;
                }
            };
            new Thread(r).start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }
}
