package com.qrx.principle.singleresponsibility;

/**
 * @author qiu
 * @version 1.8.0
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.runAir("飞机");
        vehicle.runRoad("自行车");
        vehicle.runWater("轮船");
    }

}

/**
 * 改进单一原则职责,将单一原则职责的单位从类细化到了方法
 */
class Vehicle2{
    public void runRoad(String vehicle){
        System.out.println(vehicle + "在公路上运行...");
    }
    public void runAir(String vehicle){
        System.out.println(vehicle + "在天空上运行...");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle + "在水中上运行...");
    }
}
