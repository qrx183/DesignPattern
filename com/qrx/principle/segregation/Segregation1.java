package com.qrx.principle.segregation;

/**
 * 接口隔离原则实例1(违反接口隔离原则)
 * @author qiu
 * @version 1.8.0
 */
public class Segregation1 {
    public static void main(String[] args) {

    }

}

interface Interface1 {
    void func1();

    void func2();

    void func3();

    void func4();

    void func5();
}

/**
 * B类实现了接口1
 */
class B implements Interface1 {
    @Override
    public void func1() {
        System.out.println("B 实现了 func1");
    }

    @Override
    public void func2() {
        System.out.println("B 实现了 func2");
    }

    @Override
    public void func3() {
        System.out.println("B 实现了 func3");
    }

    @Override
    public void func4() {
        System.out.println("B 实现了 func4");
    }

    @Override
    public void func5() {
        System.out.println("B 实现了 func5");
    }
}

/**
 * D实现了接口1
 */
class D implements Interface1 {
    @Override
    public void func1() {
        System.out.println("D 实现了 func1");
    }

    @Override
    public void func2() {
        System.out.println("D 实现了 func2");
    }

    @Override
    public void func3() {
        System.out.println("D 实现了 func3");
    }

    @Override
    public void func4() {
        System.out.println("D 实现了 func4");
    }

    @Override
    public void func5() {
        System.out.println("D 实现了 func5");
    }
}

/**
 * A类依赖于类B,且只使用接口1中的方法1,2,3
 */
class A{
    public void depend1(Interface1 i){
        i.func1();
    }
    public void depend2(Interface1 i){
        i.func2();
    }
    public void depend3(Interface1 i){
        i.func3();
    }
}

/**
 * C类依赖于类D,且只使用接口1中的方法1,3,5
 *
 * 上述这种接口的设计不满足接口隔离原则,即一个类对另一个类的依赖没有建立在最小的接口上,应该将接口进行分解
 */
class C{
    public void depend1(Interface1 i){
        i.func1();
    }
    public void depend5(Interface1 i){
        i.func5();
    }
    public void depend3(Interface1 i){
        i.func3();
    }
}
