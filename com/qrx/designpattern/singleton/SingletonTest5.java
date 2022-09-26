package com.qrx.designpattern.singleton;

/**
 * 懒汉式-同步代码块
 * @author qiu
 * @version 1.8.0
 */
public class SingletonTest5 {
    public static void main(String[] args) {
        Singleton5 instance1 = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();
        System.out.println(instance1 == instance2);
    }
}
class Singleton5{
    private static Singleton5 instance;
    private Singleton5(){

    }
    public static Singleton5 getInstance(){
        synchronized (instance){
            if(instance == null){
                instance = new Singleton5();
            }
            return instance;
        }
    }
}
