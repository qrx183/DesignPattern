package com.qrx.designpattern.factory.abstractfactory.chair;

/**
 * @author qiu
 * @version 1.8.0
 */
public class ScotlandChair extends Chair{
    @Override
    public void sit() {
        System.out.println("坐在苏格兰式椅子上");
    }
}
