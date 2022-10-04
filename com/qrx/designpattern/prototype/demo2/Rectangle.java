package com.qrx.designpattern.prototype.demo2;

/**
 * @author qiu
 * @version 1.8.0
 */
public class Rectangle extends Shape{

    public Rectangle(){

    }
    public Rectangle(Rectangle rectangle){
        super(rectangle);
    }
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
