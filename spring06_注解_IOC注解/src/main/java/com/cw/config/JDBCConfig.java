package com.cw.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author 陈小哥cw
 * @date 2020/12/29 9:52
 */
//@Component//建议使用import代替导入第三方bean作为spring控制的资源
public class JDBCConfig {
    /*
        设置该方法的返回值作为spring管理的bean
        说明：
        1.因为第三方bean无法在其源码上进行修改，使用@Bean解决第三方bean的引入问题
        2.该注解用于替代XML配置中的静态工厂与实例工厂创建bean，不区分方法是否为静态或非静态
        3.@Bean所在的类必须被spring扫描加载，否则该注解无法生效
     */
    @Bean("dataSource")
    public DruidDataSource getDataSource() {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/spring_db");
        ds.setUsername("root");
        ds.setPassword("123456");
        return ds;
    }
}
