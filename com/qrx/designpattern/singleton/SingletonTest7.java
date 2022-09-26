package com.qrx.designpattern.singleton;

/**
 * 饿汉式-静态内部类
 * @author qiu
 * @version 1.8.0
 */
public class SingletonTest7 {

}
class Singleton7{
    private Singleton7(){

    }

    private static class SingletonInstance{
        private static final Singleton7 INSTANCE = new Singleton7();
    }
    public static Singleton7 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
