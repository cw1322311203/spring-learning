package com.cw.dao.impl;

import com.cw.dao.BookDao;
import org.springframework.stereotype.Component;

/**
 * @author 陈小哥cw
 * @date 2020/12/28 13:43
 *
 * @Controller、@Service 、@Repository是@Component的衍生注解，功能同@Component
 */
@Component
public class BookDaoImpl2 implements BookDao {

    public void save() {
        System.out.println("book dao running...2");
    }
}
