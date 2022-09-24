package com.qrx.principle.singleresponsibility;

/**
 * 单一原则实例1
 * @author qiu
 * @version 1.8.0
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("自行车");
        vehicle.run("汽车");
        vehicle.run("飞机");
        vehicle.run("轮船");
    }
}
class Vehicle{
    /**
     * 直接调用交通工具的该方法会有些许不妥:因为该方法只是说明了公路上的交通工具,违反了单一职责原则
     * @param vehicle
     */
    public void run(String vehicle){

        System.out.println(vehicle + "在公路上运行...");
    }
}
