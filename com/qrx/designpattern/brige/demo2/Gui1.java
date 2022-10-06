package com.qrx.designpattern.brige.demo2;

/**
 * @author qiu
 * @version 1.8.0
 */
public class Gui1 extends Gui{
    public Gui1(Api api){
        super(api);
    }

    @Override
    public void clickAndScreenShot() {
        api.click();
        api.screenShot();
    }
}
