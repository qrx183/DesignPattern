package com.qrx.designpattern.flyweight;

/**
 * @author qiu
 * @version 1.8.0
 */
public class Test {
    public static void main(String[] args) {
        Tree tree = new Tree(10,11);
        tree.setTreeType("红色",100,"松树");
        tree.draw();
        Tree tree1 = new Tree(11,12);
        tree1.setTreeType("红色",100,"松树");
        tree1.draw();
        System.out.println(tree.treeType == tree1.treeType);
    }
}
