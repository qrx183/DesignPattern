package com.qrx.principle.ocp;

/**
 * 该实例违背了ocp(open close principle),在拓展的时候需要修改的比较多
 * @author qiu
 * @version 1.8.0
 */
public class Ocp1 {
    public static void main(String[] args) {
        GraphicEditor g = new GraphicEditor();
        g.drawShape(new Rectangle());
    }
}
class GraphicEditor{
    public void drawShape(Shape shape){
        if(shape.mType == 1){
            drawRectangle(shape);
        }else if(shape.mType == 2){
            drawCircle(shape);
        }
    }
    public void drawRectangle(Shape shape){
        System.out.println("画一个矩形");
    }
    public void drawCircle(Shape shape){
        System.out.println("画一个圆形");
    }
}
class Shape{
    int mType;
}
class Rectangle extends Shape{
    Rectangle(){
        super.mType = 1;
    }
}

class Circle extends Shape{
    Circle(){
        super.mType = 2;
    }
}
