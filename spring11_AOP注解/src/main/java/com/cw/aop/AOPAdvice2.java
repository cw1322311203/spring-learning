package com.cw.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 陈小哥cw
 * @date 2020/12/30 17:21
 *
 * 不同通知类中，以类名排序为准
 */
@Component
@Aspect
@Order(1)
public class AOPAdvice2 {

    @Before("AOPPointcut.pt1()")
    public void aop002exception() {
        System.out.println("前置before...2");
    }
}
