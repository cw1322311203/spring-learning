package com.cw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 陈小哥cw
 * @date 2021/1/3 15:19
 */
@Configuration
@ComponentScan("com.cw")
@PropertySource("classpath:jdbc.properties")
@Import({JDBCConfig.class, MyBatisConfig.class})
// 开启注解驱动，等同XML格式中的注解驱动
@EnableTransactionManagement
public class SpringConfig {
}
