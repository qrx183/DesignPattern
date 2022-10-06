package com.qrx.designpattern.brige.demo2;

/**
 * @author qiu
 * @version 1.8.0
 */
public abstract class Gui {
    public Api api;
    public Gui(Api api){
        this.api = api;
    }
    public abstract void clickAndScreenShot();
}
