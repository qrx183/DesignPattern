package com.qrx.designpattern.factory.abstractfactory.factory;

import com.qrx.designpattern.factory.abstractfactory.bed.Bed;
import com.qrx.designpattern.factory.abstractfactory.bed.VictoriaBed;
import com.qrx.designpattern.factory.abstractfactory.chair.Chair;
import com.qrx.designpattern.factory.abstractfactory.chair.VictoriaChair;
import com.qrx.designpattern.factory.abstractfactory.desk.Desk;
import com.qrx.designpattern.factory.abstractfactory.desk.VictoriaDesk;

/**
 * @author qiu
 * @version 1.8.0
 */
public class VictoriaFactory implements AbstractFactory{
    @Override
    public Bed createBed() {
        // 简化处理,直接new一个新的对象.
        // 当然这里也可以考虑使用单例模式啥的
        return new VictoriaBed();
    }

    @Override
    public Chair createChair() {
        return new VictoriaChair();
    }

    @Override
    public Desk createDesk() {
        return new VictoriaDesk();
    }
}
