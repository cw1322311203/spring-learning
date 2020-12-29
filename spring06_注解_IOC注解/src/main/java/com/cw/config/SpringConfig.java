package com.cw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.Order;

/**
 * @author 陈小哥cw
 * @date 2020/12/29 10:43
 */
/*
    1.核心配合类用于替换spring核心配置文件，此类可以设置空的，不设置变量与属性
    2.bean扫描工作使用注解@ComponentScan替代
 */
//设置当前类为spring核心配置加载类
@Configuration
@ComponentScan("com.cw")
/*
    Import导入第三方bean作为spring控制的资源
    1.@Import注解在同一个类上，仅允许添加一次，如果需要导入多个，使用数组的形式进行设定@Import({xx,xx})
    2.在被导入的类中可以继续使用@Import导入其他资源（了解）
    3.@Bean所在的类可以使用导入的形式进入spring容器，无需声明为bean
 */
@Import(JDBCConfig.class)
// @Order控制配置类的加载顺序，数字越小越先加载
@Order(2)
public class SpringConfig {
    @Bean("b1")
    public String getB1() {
        System.out.println("b1");
        return "";
    }
}
