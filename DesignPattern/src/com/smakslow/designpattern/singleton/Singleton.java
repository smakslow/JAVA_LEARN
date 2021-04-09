package com.smakslow.designpattern.singleton;

/**
 *
 */
public class Singleton {
    private static  Singleton singleton;
    private Singleton(){
        System.out.println("singleton is instantiated");
    }

    public   static  Singleton getSingleton(){
        if ( singleton == null){
            singleton = new Singleton();
        }
        return  singleton;
    }
    public void doSomething(){
        System.out.println("something is done");
    }
}
