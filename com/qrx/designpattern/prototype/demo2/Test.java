package com.qrx.designpattern.prototype.demo2;

/**
 * @author qiu
 * @version 1.8.0
 */
public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 10;
        circle.x = 10;
        circle.y = 10;
        circle.color = "红色";
        Circle copyCircle = (Circle)circle.clone();
        System.out.println(circle == copyCircle);
        System.out.println(copyCircle.color);
    }
}
