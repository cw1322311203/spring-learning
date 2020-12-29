package com.cw.dao.impl;

import com.cw.dao.UserDao;

/**
 * @author 陈小哥cw
 * @date 2020/12/28 9:11
 */
public class UserDaoImpl implements UserDao {

    private String username;
    private String password;

    public UserDaoImpl(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void save() {
        System.out.println("user dao running..." + username + " " + password);
    }
}
