package com.cw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 陈小哥cw
 * @date 2020/12/31 9:47
 */
@Configuration
@ComponentScan("com.cw")
// 开启AOP
@EnableAspectJAutoProxy
public class SpringConfig {
}
