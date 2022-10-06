package com.qrx.designpattern.brige.demo1;

/**
 * 利用桥接模式对图形在形状的基础上添加颜色的维度
 * @author qiu
 * @version 1.8.0
 */
public class Test {
    public static void main(String[] args) {
        Color color = new Red();
        Shape shape = new Rectangle(color);
        shape.shape();
    }
}
