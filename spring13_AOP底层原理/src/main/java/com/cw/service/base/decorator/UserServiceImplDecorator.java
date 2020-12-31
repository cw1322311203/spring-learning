package com.cw.service.base.decorator;

import com.cw.service.UserService;

/**
 * @author 陈小哥cw
 * @date 2020/12/31 15:05
 */
public class UserServiceImplDecorator implements UserService {

    private UserService userService;

    public UserServiceImplDecorator(UserService userService) {
        this.userService = userService;
    }

    public void save() {
        userService.save();
        // 增强功能
        System.out.println("刮大白");
    }
}
