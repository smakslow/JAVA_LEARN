package com.smalsow.javapractice.thread;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReaderWriteLockTest {
    public static void main(String[] args) {
        ReentrantReadWriteLock writeLock = new ReentrantReadWriteLock();
        //¼ÓÐ´Ëø
        writeLock.writeLock().lock();
        writeLock.writeLock().unlock();


        //¼Ó¶ÁËø
        writeLock.readLock().lock();
        writeLock.readLock().unlock();
    }
}
