package com.cw.service.impl;

import com.cw.service.UserService;

/**
 * @author 陈小哥cw
 * @date 2020/12/25 17:00
 */
public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
        System.out.println(" constructor is running...");
    }

    public void init() {
        System.out.println("init...");
    }

    public void destroy() {
        System.out.println("destroy...");
    }

    public void save() {
        System.out.println("user service running...");
    }
}
