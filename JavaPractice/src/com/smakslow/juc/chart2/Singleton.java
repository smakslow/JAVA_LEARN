package com.smakslow.juc.chart2;

public class Singleton {
    private static Singleton instance; // 不使?volatile关键字

    // 双重锁检验
    public static Singleton getInstance() {
        if (instance == null) { // 第7?
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(); // 第10?
                }
            }
        }
        return instance;
    }
}
