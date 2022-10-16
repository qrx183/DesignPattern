package com.qrx.designpattern.proxy;

/**
 * @author qiu
 * @version 1.8.0
 */
public class Client {
    public static void main(String[] args) {
        Server server = new Server();
        ServerInterface serverInterface = new ProxyServer(server);
        serverInterface.updateResource();
        System.out.println("============");
        System.out.println(serverInterface.selectResource());
    }
}
