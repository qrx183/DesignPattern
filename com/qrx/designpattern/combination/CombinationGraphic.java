package com.qrx.designpattern.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiu
 * @version 1.8.0
 */
public class CombinationGraphic implements Graphic{
    public List<Graphic> l;
    public int x;
    public int y;
    public CombinationGraphic(int x,int y,List<Graphic> list){
        this.x = x;
        this.y = y;
        l = list;
    }
    public void add(Graphic g){
        l.add(g);
    }
    public boolean remove(Graphic g){
        return l.remove(g);
    }
    @Override
    public String draw() {
        String ans = "";
        for(Graphic g : l){
            ans += g.draw();
        }
        return ans;
    }
}
