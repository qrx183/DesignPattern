package com.qrx.principle.singleresponsibility;

/**
 * 单一职责原则实例2
 * @author qiu
 * @version 1.8.0
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        AirVehicle airVehicle = new AirVehicle();
        WaterVehicle waterVehicle = new WaterVehicle();
        roadVehicle.run("自行车");
        roadVehicle.run("公交车");
        waterVehicle.run("轮船");
        airVehicle.run("飞机");
    }
}

/**
 * 遵守了单一设计原则
 * 改动过大,需要分成过多的类.同时需要客户端需要知道过多细节
 */
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行");
    }
}
class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在天空运行");
    }
}
class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在水中运行");
    }
}
