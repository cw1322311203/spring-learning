package com.cw.dao.impl;

import com.cw.dao.UserDao;
import org.springframework.stereotype.Component;

/**
 * @author 陈小哥cw
 * @date 2020/12/28 9:11
 * @Controller、@Service 、@Repository是@Component的衍生注解，功能同@Component
 */
@Component("userDao2")
public class UserDaoImpl2 implements UserDao {

    public void save() {
        System.out.println("user dao running...2");
    }
}
