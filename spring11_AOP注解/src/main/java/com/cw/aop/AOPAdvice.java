package com.cw.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 陈小哥cw
 * @date 2020/12/30 17:21
 */
@Component
// 设置当前类为切面类
@Aspect
/**
 * AOP使用XML配置情况下，通知的执行顺序由配置顺序决定，在注解情况下由于不存在配置顺序的概念的概念，参照通知所配置的方法名字符串对应的编码值顺序，可以简单理解为字母排序
 * 1.同一个通知类中，相同通知类型以方法名排序为准
 * 2.不同通知类中，以类名排序为准
 * 3.使用@Order注解通过变更bean的加载顺序改变通知的加载顺序
 */
@Order(2)
public class AOPAdvice {

    // 切入点最终体现为一个方法，无参无返回值，无实际方法体内容，但不能是抽象方法
    // 使用当前方法名作为切入点引用名称,被修饰的方法忽略其业务功能，格式设定为无参无返回值的方法，方法体内空实现（非抽象）
//    @Pointcut("execution(* *..*(..))")
//    public void pt() {
//    }

    // 引用切入点时必须使用方法调用名称，方法后面的（）不能省略
    // 切面类中定义的切入点只能在当前类中使用，如果想引用其他类中定义的切入点使用“类名.方法名()”引用
    @Before("AOPPointcut.pt1()")
    public void before() {
        System.out.println("前置before...");
    }

    @After("AOPPointcut.pt1()")
    public void after() {
        System.out.println("后置after...");
    }

    // 可以在通知类型注解后添加参数，实现XML配置中的属性，例如after-returning后的returning属性
    @AfterReturning(value = "AOPPointcut.pt1()", returning = "ret")
    public void afterReturning(Object ret) {
        System.out.println("返回后afterReturning...");
    }

    // throwing ：设定使用通知方法参数接收原始方法中抛出的异常对象名
    @AfterThrowing(value = "AOPPointcut.pt1()", throwing = "t")
    public void afterThrowing(Throwable t) {
        System.out.println("抛出异常后afterThrowing...");
    }

    @Around("AOPPointcut.pt1()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前around before...");
        Object ret = pjp.proceed();
        System.out.println("环绕后around after...");
        return ret;
    }

    /**
     * 1.通知方法名由3部分组成，分别是前缀、顺序编码、功能描述
     * 2.前缀为固定字符串，例如baidu、jd等，无实际意义
     * 3.顺序编码为6位以内的整数，通常3位即可，不足位补0
     * 4.功能描述为该方法对应的实际通知功能，例如exception、strLenCheck
     * 4.1 制通知执行顺序使用顺序编码控制，使用时做一定空间预留
     * 4.2 003使用，006使用，预留001、002、004、005、007、008
     * 4.3 使用时从中段开始使用，方便后期做前置追加或后置追加
     * 4.4 最终顺序以运行顺序为准，以测试结果为准，不以设定规则为准
     */
    @Before("AOPPointcut.pt1()")
    public void aop001log() {
        System.out.println("前置before...1");
    }

//    @Before("AOPPointcut.pt1()")
//    public void aop002exception() {
//        System.out.println("前置before...2");
//    }
}
