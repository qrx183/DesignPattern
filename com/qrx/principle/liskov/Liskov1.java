package com.qrx.principle.liskov;

/**
 * 该实例违反了里氏替换原则,子类对父类中的方法进行了重写
 * 解决方式就是将原来的继承关系的两个类去继承一个更基础的类,然后通过组合,聚合,依赖的方式替代继承
 * @author qiu
 * @version 1.8.0
 */
public class Liskov1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11,3));

        B b = new B();
        System.out.println("12-5=" + b.func2(12,5));
    }
}
class A{
    public int func1(int num1,int num2){
        return num1 - num2;
    }
}
class B extends A{
    @Override
    public int func1(int num1, int num2) {
        return num1 + num2;
    }
    public int func2(int num1,int num2){
        return func1(num1,num2);
    }
}
