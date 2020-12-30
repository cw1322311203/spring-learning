package com.cw.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author 陈小哥cw
 * @date 2020/12/30 14:13
 */
// 1.制作通知类，在类中定义一个方法用于完成共性功能
public class AOPAdvice {

    // 通知获取参数数据第一种情况：设定通知方法第一个参数为JoinPoint，通过该对象调用getArgs()方法，获取原始方法运行的参数数组，所有的通知均可以获取参数
    // 前置通知：原始方法执行前执行，如果通知中抛出异常，阻止原始方法运行
    // 应用：数据校验
    public void before(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println("before...");
    }

    public void before2(int x, int y) {
        System.out.println("before2(int)..." + x + " " + y);
    }

    public void before3(int x, int y) {
        System.out.println("before3(int)..." + x + " " + y);
    }

    // 后置通知：原始方法执行后执行，无论原始方法中是否出现异常，都将执行通知
    // 应用：现场清理
    public void after(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println("after...");
    }

    // 原始方法正常执行完毕并返回结果后执行，如果原始方法中抛出异常，无法执行
    // 应用：返回值相关数据处理
    public void afterReturning(Object ret) {
        System.out.println("afterReturning..." + ret);
    }

    // 抛出异常后通知：原始方法抛出异常后执行，如果原始方法没有抛出异常，无法执行
    // 应用：对原始方法中出现的异常信息进行处理
    public void afterThrowing(Throwable t) {
        System.out.println("afterThrowing..." + t.getMessage());
    }

    /*
        环绕通知：在原始方法执行前后均有对应执行执行，还可以阻止原始方法的执行
        应用：十分强大，可以做任何事情
        环绕通知是在原始方法的前后添加功能，在环绕通知中，存在对原始方法的显式调用
        public Object around(ProceedingJoinPoint pjp) throws Throwable {
            Object ret = pjp.proceed();
            return ret;
        }
        环绕通知方法相关说明：
        1.方法须设定Object类型的返回值，否则会拦截原始方法的返回。如果原始方法返回值类型为void，通知方也可以设定返回值类型为void，最终返回null
        2.方法需在第一个参数位置设定ProceedingJoinPoint对象，通过该对象调用proceed()方法，实现对原始方法的调用。如省略该参数，原始方法将无法执行
        3.使用proceed()方法调用原始方法时，因无法预知原始方法运行过程中是否会出现异常，强制抛出Throwable对象，封装原始方法中可能出现的异常信息
     */
    public Object around(ProceedingJoinPoint pjp) {
        System.out.println("around before...");
        // 对原始方法的调用
        Object ret = null;
        try {
            ret = pjp.proceed();
        } catch (Throwable throwable) {
            System.out.println("around...exception...." + throwable.getMessage());
        }
        System.out.println("around after..." + ret);
        return ret;
    }
}
