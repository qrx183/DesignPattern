package com.qrx.designpattern.combination;

/**
 * @author qiu
 * @version 1.8.0
 */
public class Rectangle implements Graphic{
    public int x;
    public int y;
    public Rectangle(int x,int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String draw() {
        return " 三角形 ";
    }
}
