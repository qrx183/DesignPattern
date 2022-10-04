package com.qrx.designpattern.factory.abstractfactory.factory;

import com.qrx.designpattern.factory.abstractfactory.bed.Bed;
import com.qrx.designpattern.factory.abstractfactory.chair.Chair;
import com.qrx.designpattern.factory.abstractfactory.desk.Desk;

/**
 * @author qiu
 * @version 1.8.0
 */
public interface AbstractFactory {
    Chair createChair();
    Desk createDesk();
    Bed createBed();
}
