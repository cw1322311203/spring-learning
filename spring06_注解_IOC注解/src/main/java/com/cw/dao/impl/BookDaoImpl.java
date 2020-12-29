package com.cw.dao.impl;

import com.cw.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author 陈小哥cw
 * @date 2020/12/28 13:43
 * @Controller、@Service 、@Repository是@Component的衍生注解，功能同@Component
 */
@Component
// Primary设置类对应的bean按类型装配时优先装配
// @Autowired默认按类型装配，当出现相同类型的bean，使用@Primary提高按类型自动装配的优先级，多个@Primary会导致优先级设置无效
@Primary
/*
    不支持*通配格式，一旦加载，所有spring控制的bean中均可使用对应属性值
    - value（默认）：设置加载的properties文件名
    - ignoreResourceNotFound：如果资源未找到，是否忽略，默认为false
 */
@PropertySource(value = {"classpath:jdbc.properties", "classpath:abc.properties"}, ignoreResourceNotFound = true)
public class BookDaoImpl implements BookDao {

    @Value("${jdbc.userName}")
    private String userName;
    @Value("${jdbc.password}")
    private String password;

    public void save() {
        System.out.println("book dao running...1 " + userName + " " + password);
    }
}
