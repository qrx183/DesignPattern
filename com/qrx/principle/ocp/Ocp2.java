package com.qrx.principle.ocp;

/**
 * 将Shape类设置成抽象类,并提供抽象方法draw,任何一个具体的图形类均即成Shape抽象类并实现draw方法
 * @author qiu
 * @version 1.8.0
 */
public class Ocp2 {
    public static void main(String[] args) {
        GraphicEditor1 g = new GraphicEditor1();
        g.draw(new Rectangle1());
    }
}
class GraphicEditor1{
    public void draw(Shape1 shape){
        shape.draw();
    }
}
abstract class Shape1{
   abstract void draw();
}
class Rectangle1 extends Shape1{
    @Override
    void draw() {
        System.out.println("画一个矩形");
    }
}
class Circle1 extends Shape1{
    @Override
    void draw() {
        System.out.println("画一个圆形");
    }
}
