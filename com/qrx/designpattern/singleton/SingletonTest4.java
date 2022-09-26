package com.qrx.designpattern.singleton;

/**
 * 懒汉式-同步方法
 * @author qiu
 * @version 1.8.0
 */
public class SingletonTest4 {
    public static void main(String[] args) {
        Singleton4 instance1 = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        System.out.println(instance1 == instance2);
    }
}
class Singleton4{
    private static Singleton4 instance;

    private Singleton4(){

    }
    public synchronized static Singleton4 getInstance(){
        if(instance == null){
            instance = new Singleton4();
        }
        return instance;
    }
}
