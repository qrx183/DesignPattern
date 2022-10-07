package com.qrx.designpattern.decoration;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author qiu
 * @version 1.8.0
 */
public class Test {
    public static void main(String[] args) {
        String message = "Hello World!";
        Notifier notifier = new QQDecorator(new WeCHatDecorator(new ConcentrateNotifier()));
        notifier.send(message);
    }
}
