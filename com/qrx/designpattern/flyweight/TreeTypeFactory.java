package com.qrx.designpattern.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiu
 * @version 1.8.0
 */
public class TreeTypeFactory {
    private static List<TreeType> l = new ArrayList<>();
    public TreeTypeFactory(){
    }
    public static TreeType getTreeType(String color,String type,int height){
        for(TreeType t : l){
            if(color.equals(t.color) && type.equals(t.type) && height == t.height){
                return t;
            }
        }
        TreeType newTree = new TreeType(color,height,type);
        l.add(newTree);
        return newTree;
    }
}
