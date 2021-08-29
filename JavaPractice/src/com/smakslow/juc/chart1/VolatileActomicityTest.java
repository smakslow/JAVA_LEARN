package com.smakslow.juc.chart1;

/**
 * @ClassName: VolatileActomicityTest
 * @Description: volatile 内存原子性测试
 * @date: 2018年8月31日 下午10:35:33
 */
public class VolatileActomicityTest {

    private volatile static int count = 0;

    /**
     * @Title: main
     * @Description: volatile 内存可见性测试
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
