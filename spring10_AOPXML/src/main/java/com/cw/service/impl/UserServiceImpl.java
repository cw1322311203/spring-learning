package com.cw.service.impl;

import com.cw.service.UserService;

/**
 * @author 陈小哥cw
 * @date 2020/12/30 14:05
 */
public class UserServiceImpl implements UserService {
    public void save(int i, int m) {
        System.out.println("user service running..." + i + " " + m);
//        int i = 1 / 0;
    }

    public int update() {
        System.out.println("user service update running...");
//        int i = 1 / 0;
        return 100;
    }

    public void delete() {
        System.out.println("user service delete running...");
        int i = 1 / 0;
    }
}
