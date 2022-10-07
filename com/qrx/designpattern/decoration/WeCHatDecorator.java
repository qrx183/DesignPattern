package com.qrx.designpattern.decoration;

/**
 * @author qiu
 * @version 1.8.0
 */
public class WeCHatDecorator extends BaseDecorator{

    public WeCHatDecorator(Notifier notifier){
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.println("向微信中发送这条信息");
        super.send(message);
    }
}
