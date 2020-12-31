package com.cw.service;

import com.cw.config.SpringConfig;
import com.cw.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

//设定spring专用的类加载器
@RunWith(SpringJUnit4ClassRunner.class)
//设定加载的spring上下文对应的配置
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testFindById() {
        Account ac = accountService.findById(2);
//        System.out.println(ac);
    }

    @Test
    public void testFindAll() {
        List<Account> list = accountService.findAll();
//        System.out.println(list);
    }

}
