package com.qrx.designpattern.proxy;

/**
 * @author qiu
 * @version 1.8.0
 */
public class Server implements ServerInterface{

    @Override
    public void updateResource() {
        System.out.println("修改了某某资源");
    }

    @Override
    public String selectResource() {
        return "某个资源";
    }
}
