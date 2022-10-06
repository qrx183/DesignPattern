package com.qrx.designpattern.brige.demo2;

/**
 * 利用桥接模式将一个庞杂的类拆分成抽象(GUI)和实现(API)两部分
 * @author qiu
 * @version 1.8.0
 */
public class Test {
    public static void main(String[] args) {
        Api api = new Windows();
        Gui gui = new Gui1(api);
        gui.clickAndScreenShot();
    }
}
