package com.smalsow.javapractice.thread;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class LLU {
    private LinkedHashMap<String, String> map = new LinkedHashMap<>();
    private int n;
    private ReentrantLock lock = new ReentrantLock();
    private Condition put = lock.newCondition();
    private Condition get = lock.newCondition();

    public LLU(int n) {
        this.n = n;
    }

    public String get(String key) {
        String value = "";
        while (map.isEmpty() || !map.containsValue(key)) {
            lock.lock();
            try {
                get.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
        value = map.get(key);
        map.remove(key);
        put.signalAll();

        return value;
    }

    public void put(String key, String value) {
        if (map.size() >= n) {
            lock.lock();
            try {
                put.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
        map.put(key, value);
        get.signalAll();
    }

    public static void main(String[] args) {
        LLU llu = new LLU(10);
        for (int i = 0; i < 20; i++) {
            llu.put(String.valueOf(i), i + " ");
        }
    }
}
