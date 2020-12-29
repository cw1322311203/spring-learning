package com.cw.service;

import com.cw.service.impl.UserServiceImpl;

/**
 * @author 陈小哥cw
 * @date 2020/12/27 19:27
 */
public class UserServiceFactory {
    public static UserService getService() {
        System.out.println("factory create object...");
        return new UserServiceImpl();
    }
}
