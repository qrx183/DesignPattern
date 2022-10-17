package com.qrx.designpattern.chainofcommand;

/**
 * @author qiu
 * @version 1.8.0
 */
public abstract class MiddleWare {
    private MiddleWare next;

    public static MiddleWare link(MiddleWare first,MiddleWare... chain){
        MiddleWare head = first;
        for(MiddleWare middleWare : chain){
            head.next = middleWare;
            head = middleWare;
        }
        return first;
    }
    public abstract boolean check(String email,String password);

    protected boolean checkNext(String email,String password){
        if(next == null){
            return true;
        }
        return next.check(email,password);
    }
}
