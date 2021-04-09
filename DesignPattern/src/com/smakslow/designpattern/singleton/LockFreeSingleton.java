package com.smakslow.designpattern.singleton;

/**
 * �������̰߳�ȫ����ģʽ
 * @author stark_h
 */
public class LockFreeSingleton {
    private  static final LockFreeSingleton instance =  new LockFreeSingleton();

    public LockFreeSingleton() {
        System.out.println("singleton is instantiated");
    }

    public static synchronized  LockFreeSingleton  getInstance(){
        return  instance;
    }

    public  void doSomething (){
        System.out.println("do something");
    }
}
