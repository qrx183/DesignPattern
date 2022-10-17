package com.qrx.designpattern.chainofcommand;

/**
 * @author qiu
 * @version 1.8.0
 */
public class RoleCheckMiddleWare extends MiddleWare{
    @Override
    public boolean check(String email, String password) {
        if("admin@hh.com".equals(email)){
            System.out.println("Hello,Admin!");
            return true;
        }
        System.out.println("Hello,User");
        return checkNext(email,password);
    }
}
