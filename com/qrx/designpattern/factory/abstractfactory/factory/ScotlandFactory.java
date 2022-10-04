package com.qrx.designpattern.factory.abstractfactory.factory;

import com.qrx.designpattern.factory.abstractfactory.bed.Bed;
import com.qrx.designpattern.factory.abstractfactory.bed.ScotlandBed;
import com.qrx.designpattern.factory.abstractfactory.chair.Chair;
import com.qrx.designpattern.factory.abstractfactory.chair.ScotlandChair;
import com.qrx.designpattern.factory.abstractfactory.desk.Desk;
import com.qrx.designpattern.factory.abstractfactory.desk.ScotlandDesk;

/**
 * @author qiu
 * @version 1.8.0
 */
public class ScotlandFactory implements AbstractFactory{
    @Override
    public Desk createDesk() {
        return new ScotlandDesk();
    }

    @Override
    public Bed createBed() {
        return new ScotlandBed();
    }

    @Override
    public Chair createChair() {
        return new ScotlandChair();
    }
}
