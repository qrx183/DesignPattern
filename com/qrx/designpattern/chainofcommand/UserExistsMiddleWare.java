package com.qrx.designpattern.chainofcommand;

/**
 * @author qiu
 * @version 1.8.0
 */
public class UserExistsMiddleWare extends MiddleWare{

    private Server server;
    public UserExistsMiddleWare(Server server){
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if(!server.hasEmail(email)){
            System.out.println("这个邮箱还没有被注册过");
            return false;
        }
        if(!server.isValidPassword(email,password)){
            System.out.println("邮箱名和密码不正确");
            return false;
        }
        return checkNext(email,password);
    }
}
