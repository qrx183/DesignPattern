package com.qrx.designpattern.factory.abstractfactory.desk;

/**
 * @author qiu
 * @version 1.8.0
 */
public class ScotlandDesk extends Desk{
    @Override
    public void load() {
        System.out.println("将东西放在苏格兰式的桌子上");
    }
}
