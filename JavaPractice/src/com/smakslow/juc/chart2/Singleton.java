package com.smakslow.juc.chart2;

public class Singleton {
    private static Singleton instance; // ��ʹ?volatile�ؼ���

    // ˫��������
    public static Singleton getInstance() {
        if (instance == null) { // ��7?
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(); // ��10?
                }
            }
        }
        return instance;
    }
}
