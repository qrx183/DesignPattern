package com.qrx.designpattern.decoration;

/**
 * @author qiu
 * @version 1.8.0
 */
public class QQDecorator extends BaseDecorator{

    public QQDecorator(Notifier notifier){
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.println("向QQ中发送这条信息");
        super.send(message);
    }
}
