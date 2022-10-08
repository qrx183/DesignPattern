package com.qrx.designpattern.flyweight;

/**
 * @author qiu
 * @version 1.8.0
 */
public class Tree {
    public int x;
    public int y;
    public TreeType treeType;
    public Tree(int x,int y){
        this.x  = x;
        this.y = y;
    }
    public void setTreeType(String color,int height,String type){
        treeType = TreeTypeFactory.getTreeType(color,type,height);

    }
    public void draw(){
        System.out.println("绘制的坐标为" + "[" + x +"," + y +"]");
        treeType.draw();
    }
}
