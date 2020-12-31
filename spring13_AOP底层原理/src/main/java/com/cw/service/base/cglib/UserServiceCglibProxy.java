package com.cw.service.base.cglib;

import com.cw.service.UserService;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 陈小哥cw
 * @date 2020/12/31 15:37
 */
public class UserServiceCglibProxy {
    public static UserService createUserServiceCglibProxy(Class clazz) {
        // 创建Enhancer对象(可以理解为内存中动态创建了一个类的字节码)
        Enhancer enhancer = new Enhancer();
        // 设置Enhancer对象的父类是指定类型UserServiceImpl
        enhancer.setSuperclass(clazz);
        // 设置回调方法
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                Object ret = methodProxy.invokeSuper(o, args);
                if (method.getName().equals("save")) {
                    System.out.println("刮大白3");
                    System.out.println("贴墙纸3");
                }
                return ret;
            }
        });
        // 使用Enhancer对象创建对应的对象
        return (UserService) enhancer.create();
    }
}
