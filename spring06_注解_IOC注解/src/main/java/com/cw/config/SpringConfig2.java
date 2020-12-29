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
@Configuration
@ComponentScan("com.cw")
@Import(JDBCConfig.class)
@Order(1)
public class SpringConfig2 {
    @Bean("b2")
    public String getB2() {
        System.out.println("b2");
        return "";
    }
}
