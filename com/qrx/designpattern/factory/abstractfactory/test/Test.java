package com.qrx.designpattern.factory.abstractfactory.test;

import com.qrx.designpattern.factory.Factory;
import com.qrx.designpattern.factory.abstractfactory.bed.Bed;
import com.qrx.designpattern.factory.abstractfactory.chair.Chair;
import com.qrx.designpattern.factory.abstractfactory.desk.Desk;
import com.qrx.designpattern.factory.abstractfactory.factory.AbstractFactory;
import com.qrx.designpattern.factory.abstractfactory.factory.ScotlandFactory;
import com.qrx.designpattern.factory.abstractfactory.factory.VictoriaFactory;

import java.util.Scanner;

/**
 * 抽象工厂模式实现家居的定制功能
 * @author qiu
 * @version 1.8.0
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opt = scanner.next();
        AbstractFactory factory = getOption(opt);
        if(factory == null){
            throw new RuntimeException("没有您选取的风格,请查看是否输入错误");
        }
        Chair chair = factory.createChair();
        Desk desk = factory.createDesk();
        Bed bed = factory.createBed();
        chair.sit();;
        desk.load();
        bed.lie();
    }
    private static AbstractFactory getOption(String opt){
        if("Victoria".equals(opt)){
            return new VictoriaFactory();
        }else if("Scotland".equals(opt)){
            return new ScotlandFactory();
        }else{
            return null;
        }
    }
}
