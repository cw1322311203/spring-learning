package com.cw.service.base.proxy;

import com.cw.service.UserService;
import com.cw.service.impl.UserServiceImpl;

/**
 * @author 陈小哥cw
 * @date 2020/12/31 15:23
 */
// JDKProxy动态代理是针对对象做代理，要求原始对象具有接口实现，并对接口方法进行增强
public class App {
    public static void main(String[] args) {
        UserService userService=new UserServiceImpl();
        UserService userService1=UserServiceJDKProxy.createUserServiceJDKProxy(userService);
        userService1.save();
    }
}
