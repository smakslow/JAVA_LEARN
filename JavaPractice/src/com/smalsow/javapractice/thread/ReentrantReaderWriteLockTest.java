package com.smalsow.javapractice.thread;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReaderWriteLockTest {
    public static void main(String[] args) {
        ReentrantReadWriteLock writeLock = new ReentrantReadWriteLock();
        //��д��
        writeLock.writeLock().lock();
        writeLock.writeLock().unlock();


        //�Ӷ���
        writeLock.readLock().lock();
        writeLock.readLock().unlock();
    }
}
