package com.smakslow.javapractice.thread;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(true);

        lock.lock();
        int holdCount = lock.getHoldCount();
        System.out.println(holdCount);
        boolean fair = lock.isFair();
        System.out.println(fair);
    }
}
