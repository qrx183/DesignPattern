package com.qrx.principle.liskov;

/**
 * 通过组合来代替继承,满足了里氏替换原则
 * @author qiu
 * @version 1.8.0
 */
public class Liskov2 {
    public static void main(String[] args) {

    }
}
class Base{

}
class A1 extends Base{
    public int func1(int num1,int num2){
        return num1 - num2;
    }
}
class B1 extends Base{
    private A1 a1 = new A1();
    public int func2(int num1,int num2){
        return a1.func1(num1,num2);
    }
}
