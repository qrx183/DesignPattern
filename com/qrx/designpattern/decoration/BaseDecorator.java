package com.qrx.designpattern.decoration;

/**
 * @author qiu
 * @version 1.8.0
 */
public class BaseDecorator implements Notifier{
    Notifier notifier;
    public BaseDecorator(Notifier notifier){
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        notifier.send(message);
    }
}
