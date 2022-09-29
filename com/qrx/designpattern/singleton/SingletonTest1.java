package com.qrx.designpattern.singleton;

import java.util.Calendar;

/**
 * 饿汉式-静态常量
 * @author qiu
 * @version 1.8.0
 */
public class SingletonTest1 {

    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        Calendar calendar = Calendar.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode() == instance2.hashCode());
    }
}
class Singleton1{
    private final static Singleton1 instance = new Singleton1();
    private Singleton1(){

    }
    public static Singleton1 getInstance(){
        return instance;
    }
}
