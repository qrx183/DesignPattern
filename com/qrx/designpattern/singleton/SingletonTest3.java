package com.qrx.designpattern.singleton;

/**
 * 懒汉式-线程不安全
 * @author qiu
 * @version 1.8.0
 */
public class SingletonTest3 {
    public static void main(String[] args) {
        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance1 == instance2);
    }
}
class Singleton3{
    private static Singleton3 instance;
    private Singleton3(){

    }
    public static Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
