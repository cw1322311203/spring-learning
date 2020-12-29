package com.cw.service.impl;

import com.cw.dao.UserDao;
import com.cw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author 陈小哥cw
 * @date 2020/12/25 17:00
 *
 */
@Component("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void save() {
        System.out.println("user service running..." );
        userDao.save();
    }


}
