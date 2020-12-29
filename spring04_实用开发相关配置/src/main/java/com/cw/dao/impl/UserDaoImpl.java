package com.cw.dao.impl;

import com.cw.dao.UserDao;

/**
 * @author 陈小哥cw
 * @date 2020/12/28 9:11
 */
public class UserDaoImpl implements UserDao {

    private String userName;
    private String pwd;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void save() {
        System.out.println("user dao running..." + userName + " " + pwd);
    }
}
