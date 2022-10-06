package com.qrx.designpattern.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiu
 * @version 1.8.0
 */
public class Test {
    public static void main(String[] args) {
        List<Graphic> l = new ArrayList<>();
        Graphic g1 = new Circle(0,0,10);
        Graphic g2 = new Circle(1,1,5);
        Graphic g3 = new Rectangle(3,3);
        l.add(g1);
        l.add(g2);
        l.add(g3);
        Graphic g = new CombinationGraphic(10,10,l);
        System.out.println(g.draw());
    }
}
