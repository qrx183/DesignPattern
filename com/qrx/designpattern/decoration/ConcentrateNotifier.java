package com.qrx.designpattern.decoration;

/**
 * @author qiu
 * @version 1.8.0
 */
public class ConcentrateNotifier implements Notifier{

    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
