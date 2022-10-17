package com.qrx.designpattern.chainofcommand;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qiu
 * @version 1.8.0
 */
public class Server {
    private Map<String,String> users = new HashMap<>();
    private MiddleWare middleWare;

    public void setMiddleWare(MiddleWare middleWare){
        this.middleWare = middleWare;
    }
    public boolean login(String email,String password){
        if(middleWare.check(email,password)){
            System.out.println("成功注册");
            return true;
        }
        return false;
    }
    public void register(String email,String password){
        users.put(email,password);
    }
    public boolean hasEmail(String email){
        return users.containsKey(email);
    }
    public boolean isValidPassword(String email,String password){
        return password.equals(users.get(email));
    }
}
