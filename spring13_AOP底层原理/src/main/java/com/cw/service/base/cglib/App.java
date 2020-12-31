package com.cw.service.base.cglib;

import com.cw.service.UserService;
import com.cw.service.impl.UserServiceImpl;

/**
 * @author 陈小哥cw
 * @date 2020/12/31 15:38
 *
 * - CGLIB(Code Generation Library)，Code生成类库
 * - CGLIB动态代理不限定是否具有接口，可以对任意操作进行增强
 * - CGLIB动态代理无需要原始被代理对象，动态创建出新的代理对象
 */
public class App {
    public static void main(String[] args) {
        UserService userService = UserServiceCglibProxy.createUserServiceCglibProxy(UserServiceImpl.class);
        userService.save();
    }
}
