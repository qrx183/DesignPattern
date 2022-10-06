package com.qrx.designpattern.brige.demo2;

/**
 * @author qiu
 * @version 1.8.0
 */
public class Windows extends Api{
    @Override
    public void click() {
        System.out.println("在Windows系统上点击...");
    }

    @Override
    public void screenShot() {
        System.out.println("在Windows系统上截图...");
    }
}
