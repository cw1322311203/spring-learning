package com.cw.aop;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @author 陈小哥cw
 * @date 2020/12/31 9:26
 */
public class AOPPointcut {
    @Pointcut("execution(* *..*(..))")
    public void pt1() {
    }
}
