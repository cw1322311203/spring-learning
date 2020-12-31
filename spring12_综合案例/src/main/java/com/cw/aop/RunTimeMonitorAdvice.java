package com.cw.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author 陈小哥cw
 * @date 2020/12/31 10:06
 */
@Component
@Aspect
public class RunTimeMonitorAdvice {
    // 切入点，监控业务层接口,拦截所有的业务层接口中查询操作的执行
    @Pointcut("execution(* com.cw.service.*Service.find*(..))")
    public void pt() {
    }

    @Around("pt()")
    public Object runtimeAround(ProceedingJoinPoint pjp) throws Throwable {
        // 获取执行签名信息
        Signature signature = pjp.getSignature();
        // 通过签名获取执行类型(接口名)
        String className = signature.getDeclaringTypeName();
        // 通过签名获取执行操作名称(方法名)
        String methodName = signature.getName();
        long sum = 0L;
        for (int i = 0; i < 10000; i++) {
            long startTime = System.currentTimeMillis();
            pjp.proceed(pjp.getArgs());
            long endTime = System.currentTimeMillis();
            sum += endTime - startTime;
        }
        System.out.println(className + ":" + methodName + "   (万次)运行了:" + sum + "ms");

        return null;
    }
}
