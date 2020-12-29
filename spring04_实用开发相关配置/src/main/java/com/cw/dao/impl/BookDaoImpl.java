package com.cw.dao.impl;

import com.cw.dao.BookDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Properties;

/**
 * @author 陈小哥cw
 * @date 2020/12/28 13:43
 */
public class BookDaoImpl implements BookDao {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public void save() {
        System.out.println("book dao running..." + " " + num);
    }
}
