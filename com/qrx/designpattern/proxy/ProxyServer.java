package com.qrx.designpattern.proxy;

/**
 * @author qiu
 * @version 1.8.0
 */
public class ProxyServer implements ServerInterface{
    private ServerInterface server;
    public ProxyServer(ServerInterface server){
        this.server = server;
    }

    @Override
    public void updateResource() {
        System.out.println("作前置检查");
        server.updateResource();
        System.out.println("作后置通知");
    }

    @Override
    public String selectResource() {
        System.out.println("作前置检查");
        String ans = server.selectResource();
        return ans;
    }
}
