package com.qrx.designpattern.brige.demo1;

/**
 * @author qiu
 * @version 1.8.0
 */
public class Rectangle extends Shape{
    public Rectangle(Color color){
        super(color);
    }
    @Override
    public void shape() {
        System.out.println("这个图形是一个三角形");
        color.color();
    }
}
