package com.qrx.designpattern.brige.demo1;

/**
 * @author qiu
 * @version 1.8.0
 */
public abstract class Shape {
    public Color color;
    public Shape(Color color){
        this.color = color;
    }
    public abstract void shape();
}
