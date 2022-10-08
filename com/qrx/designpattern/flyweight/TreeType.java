package com.qrx.designpattern.flyweight;

/**
 * @author qiu
 * @version 1.8.0
 */
public class TreeType {
    public String color;
    public int height;
    public String type;

    public TreeType(String color,int height,String type){
        this.color = color;
        this.height = height;
        this.type = type;
    }
    public void draw(){
        System.out.println("绘制的树的品种为" + type);
        System.out.println("绘制的树的高度为" + height);
        System.out.println("绘制的树的颜色为" + color);
    }
}
