package com.qrx.designpattern.chainofcommand;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author qiu
 * @version 1.8.0
 */
public class Test {
    private static Server server;
    private static Scanner scanner;

    private static void init(){
        scanner = new Scanner(System.in);
        server = new Server();
        server.register("admin@hh.com","1234");
        server.register("user@hh.com","1234");

        MiddleWare middleWare = MiddleWare.link(new ThrottlingMiddleWare(2),new UserExistsMiddleWare(server),
                new RoleCheckMiddleWare());
        server.setMiddleWare(middleWare);
    }

    public static void main(String[] args) {
        init();
        boolean flag;
        do {
            System.out.println("Enter email:");
            String email = scanner.nextLine();
            System.out.println("Enter password:");
            String password = scanner.nextLine();
            flag = server.login(email,password);
        }while(!flag);
    }
}
