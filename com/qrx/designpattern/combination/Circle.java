package com.qrx.designpattern.combination;

/**
 * @author qiu
 * @version 1.8.0
 */
public class Circle implements Graphic{
    public int radius;
    public int x;
    public int y;
    public Circle(int x,int y,int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public String draw() {
        return " 圆形 ";
    }
}
