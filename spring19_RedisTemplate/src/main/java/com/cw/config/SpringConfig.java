package com.cw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.cw")
@Import(RedisConfig.class)
public class SpringConfig {
}
