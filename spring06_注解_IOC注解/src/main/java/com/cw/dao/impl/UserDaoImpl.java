package com.cw.dao.impl;

import com.cw.dao.UserDao;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @author 陈小哥cw
 * @date 2020/12/28 9:11
 * @Controller、@Service 、@Repository是@Component的衍生注解，功能同@Component
 */
@Component("userDao")
/*
    @DependsOn:类注解、方法注解
    - 类型：类注解、方法注解
    - 位置：bean定义的位置（类上或方法上）
    - 作用：控制bean的加载顺序，使其在指定bean加载完毕后再加载
    1.配置在方法上，使@DependsOn指定的bean优先于@Bean配置的bean进行加载
    2.配置在类上，使@DependsOn指定的bean优先于当前类中所有@Bean配置的bean进行加载
    3.配置在类上，使@DependsOn指定的bean优先于@Component等配置的bean进行加载
 */
@DependsOn("userService")
public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("dao running...");
    }

    public void save() {
        System.out.println("user dao running...");
    }
}
