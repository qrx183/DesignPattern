package com.qrx.principle.dependencyreverse;

/**
 * @author qiu
 * @version 1.8.0
 */
public class DependencyReverse {


    public static void main(String[] args) {
        Email email = new Email();
        WeChat weChat = new WeChat();
        Person p = new Person();
       p.receive(email);
    }
}
interface MyReceiver{
    String getInfo();
}
class Email implements MyReceiver{
    @Override
    public String getInfo() {
        return "电子邮件信息: hello world";
    }
}
class WeChat implements MyReceiver{
    @Override
    public String getInfo() {
        return "微信消息: Hello";
    }
}

class Person{
    /**
     * 高级模块和底层模块依赖抽象(接口形参)
     */
    public void receive(MyReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}

