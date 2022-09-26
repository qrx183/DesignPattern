package com.qrx.designpattern.singleton;

/**
 * 懒汉式-双重校验
 * @author qiu
 * @version 1.8.0
 */
public class SingletonTest6 {
    public static void main(String[] args) {

    }
}

class Singleton6{
    private static volatile Singleton6 instance;
    private Singleton6(){

    }
    public static Singleton6 getInstance(){
        if(instance == null){
            synchronized (Singleton6.class){
                if(instance == null){
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}