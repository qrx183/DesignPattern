package com.qrx.designpattern.singleton;

/**
 * @author qiu
 * @version 1.8.0
 */
public class SingtonTest8 {

    public static void main(String[] args) {

    }
}
class Singleton{
    private Singleton(){

    }

    private enum SingletonInstance{
        INSTANCE;
        private static final Singleton instance = new Singleton();

        private Singleton getInstance(){
            return instance;
        }
    }
    public static  Singleton getInstance(){
        return SingletonInstance.INSTANCE.getInstance();
    }
}

