package com.qrx.designpattern.factory;
import java.util.Calendar;
import java.util.EnumSet;
import java.util.ResourceBundle;

/**
 * @author qiu
 * @version 1.8.0
 */
@SuppressWarnings("all")
public class Factory {
    // 实现对象的重用和构建的混合
    ResourceBundle resourceBundle = ResourceBundle.getBundle("re");

    // 在方法层面实现的简单工厂模式
    Calendar calendar = Calendar.getInstance();

    // 在方法层面实现的简单工厂模式
    EnumSet<COLOR> enumSet = EnumSet.of(COLOR.RED);


}
