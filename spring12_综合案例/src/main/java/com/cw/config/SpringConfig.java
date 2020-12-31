package com.cw.config;


import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.cw")
@PropertySource("classpath:jdbc.properties")
@Import({JDBCConfig.class, MyBatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
