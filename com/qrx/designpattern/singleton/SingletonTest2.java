package com.qrx.designpattern.singleton;

/**
 * 饿汉式-静态代码块
 * @author qiu
 * @version 1.8.0
 */
public class SingletonTest2 {

    public static void main(String[] args) {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.getClass() == instance2.getClass());
    }

}
class Singleton2{
    private static Singleton2 instance;
    private Singleton2(){

    }
    static{
        instance = new Singleton2();
    }
    public static Singleton2 getInstance(){
        return instance;
    }
}
