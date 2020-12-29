package com.cw.service.impl;

import com.cw.dao.BookDao;
import com.cw.dao.UserDao;
import com.cw.service.UserService;

/**
 * @author 陈小哥cw
 * @date 2020/12/25 17:00
 */
public class UserServiceImpl implements UserService {


    private int num;// 如果是Integer类型也当非引用类型来用
    private String version;
    private UserDao userDao;
    private BookDao bookDao;

    public UserServiceImpl() {
    }

    // 构造器注入
    public UserServiceImpl(int num, String version, UserDao userDao) {
        this.num = num;
        this.version = version;
        this.userDao = userDao;
    }

    // set注入
    // 1.对需要进行注入的变量添加set方法
    public void setNum(int num) {
        this.num = num;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("user service running..." + num + " " + version);
        userDao.save();
        bookDao.save();
    }
}
