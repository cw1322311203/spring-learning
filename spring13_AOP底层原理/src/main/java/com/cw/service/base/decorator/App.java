package com.cw.service.base.decorator;

import com.cw.service.UserService;
import com.cw.service.impl.UserServiceImpl;

/**
 * @author 陈小哥cw
 * @date 2020/12/31 15:14
 * <p>
 * 静态代理
 * 装饰者模式（Decorator Pattern）：在不惊动原始设计的基础上，为其添加功能
 */
public class App {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserService userService1 = new UserServiceImplDecorator(userService);
        UserService userService2 = new UserServiceImplDecorator2(userService1);
        userService2.save();
    }
}
