package com.qrx.designpattern.prototype.demo1;

/**
 * @author qiu
 * @version 1.8.0
 */
public class Sheep implements Cloneable{

    private String name;
    private String color;
    private int age;

    public Sheep(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = null;
        sheep =(Sheep)super.clone();
        return sheep;
  }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
//        Sheep sheep = new Sheep("first","white",8);
//        Sheep sheep1 = (Sheep)sheep.clone();
//        Sheep sheep2 = (Sheep)sheep.clone();
//        System.out.println(sheep1 == sheep);
//        System.out.println(sheep1.getColor() == sheep.getColor());

    }
}

