package com.qrx.designpattern.prototype.demo2;

/**
 * @author qiu
 * @version 1.8.0
 */
public abstract class Shape {
    public int x;
    public int y;
    public String color;
    public Shape(){

    }
    public Shape(Shape shape){
        if(shape != null){
            this.x = shape.x;
            this.y = shape.y;
            this.color = shape.color;
        }
    }
    public abstract Shape clone();
}
