package com.qrx.principle.segregation;

/**
 * 接口隔离原则实例2(符合接口隔离原则)
 * @author qiu
 * @version 1.8.0
 */
public class Segregation2 {

}


interface Interface2 {
    void func1();

    void func3();


}
interface Interface3{

    void func5();
}
interface Interface4{
    void func2();
    void func4();


}

/**
 * B类实现了接口1
 */
class B1 implements Interface2,Interface3 {
    @Override
    public void func1() {
        System.out.println("B 实现了 func1");
    }

    @Override
    public void func5() {
        System.out.println("B 实现了 func5");
    }

    @Override
    public void func3() {
        System.out.println("B 实现了 func3");
    }

}

/**
 * D实现了接口1
 */
class D1 implements Interface3,Interface4 {

    @Override
    public void func2() {
        System.out.println("D 实现了 func2");
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
class A1{
    public void depend1(Interface2 i){
        i.func1();
    }
    public void depend2(Interface4 i){
        i.func2();
    }
    public void depend3(Interface2 i){
        i.func3();
    }
}

/**
 * C类依赖于类D,且只使用接口1中的方法1,3,5
 *
 * 通过将1个接口分解成3个接口,类B和D在实现接口时就无须像之前一样实现一个接口中的全部方法
 * 符合了接口隔离原则
 */
class C1{
    public void depend1(Interface2 i){
        i.func1();
    }
    public void depend5(Interface3 i){
        i.func5();
    }
    public void depend3(Interface2 i){
        i.func3();
    }
}

