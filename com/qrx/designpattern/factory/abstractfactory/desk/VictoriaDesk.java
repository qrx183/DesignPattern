package com.qrx.designpattern.factory.abstractfactory.desk;

/**
 * @author qiu
 * @version 1.8.0
 */
public class VictoriaDesk extends Desk{
    @Override
    public void load() {
        System.out.println("将东西放在维多利亚式桌子上");
    }
}
