package com.cw.service.impl;

import com.cw.dao.AccountDao;
import com.cw.dao.BookDao;
import com.cw.dao.EquipmentDao;
import com.cw.dao.UserDao;
import com.cw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author 陈小哥cw
 * @date 2020/12/25 17:00
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private BookDao bookDao;

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private EquipmentDao equipmentDao;


    public void save() {
        System.out.println("user service running...");
        userDao.save();
        bookDao.save();
        accountDao.save();
        equipmentDao.save();
    }


}
