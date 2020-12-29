package com.cw.service.impl;

import com.cw.dao.BookDao;
import com.cw.dao.UserDao;
import com.cw.service.UserService;

/**
 * @author 陈小哥cw
 * @date 2020/12/25 17:00
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private BookDao bookDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("user service running...");
        userDao.save();
        bookDao.save();
    }
}
