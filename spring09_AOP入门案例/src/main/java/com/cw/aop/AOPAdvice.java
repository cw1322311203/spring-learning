package com.cw.aop;

/**
 * @author 陈小哥cw
 * @date 2020/12/30 14:13
 */
// 1.制作通知类，在类中定义一个方法用于完成共性功能
public class AOPAdvice {

    public void function() {
        System.out.println("共性功能");
    }
}
