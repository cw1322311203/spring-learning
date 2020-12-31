package com.cw.service;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(proxyTargetClass = true)
public interface UserService {
    public void save();
}
