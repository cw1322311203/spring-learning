package com.cw.service.impl;

import com.cw.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author 陈小哥cw
 * @date 2020/12/30 17:21
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    public int save(int i, int m) {
        System.out.println("user service running..." + i + "," + m);
        return 100;
    }
}
