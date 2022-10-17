package com.qrx.designpattern.chainofcommand;

/**
 * @author qiu
 * @version 1.8.0
 */
public class ThrottlingMiddleWare extends MiddleWare{
    private int requestMax;
    private int request;
    private long currentTime;

    public ThrottlingMiddleWare(int requestMax){
        this.requestMax =requestMax;
        currentTime = System.currentTimeMillis();
    }

    @Override
    public boolean check(String email, String password) {
        if(System.currentTimeMillis() > currentTime + 60000){
            request = 0;
            currentTime = System.currentTimeMillis();
        }
        request++;

        if(request > requestMax){
            System.out.println("请求数量超过限制");
            Thread.currentThread().stop();
        }
        return checkNext(email,password);
    }
}
