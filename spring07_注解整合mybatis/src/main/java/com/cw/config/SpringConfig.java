package com.cw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 陈小哥cw
 * @date 2020/12/29 13:24
 */
@Configuration
@ComponentScan("com.cw")
@PropertySource("classpath:jdbc.properties")
@Import({JDBCConfig.class, MyBatisConfig.class})
public class SpringConfig {
}
