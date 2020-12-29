package com.cw.dao.impl;

import com.cw.dao.UserDao;
import org.springframework.stereotype.Component;

/**
 * @author 陈小哥cw
 * @date 2020/12/29 16:08
 */
@Component("userDao")
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("user dao running...");
    }
}
