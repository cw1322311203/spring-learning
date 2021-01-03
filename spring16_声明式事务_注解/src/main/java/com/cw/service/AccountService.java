package com.cw.service;

import com.cw.domain.Account;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

// 主流配置到接口上，接口上配置一个通用的，具体方法上配置特例的
@Transactional(isolation = Isolation.DEFAULT)
public interface AccountService {

    /**
     * 转账操作
     *
     * @param outName 出账用户名
     * @param inName  入账用户名
     * @param money   转账金额
     */
    // 位置：方法定义上方，类定义上方，接口定义上方
    // 作用：设置当前类/接口中所有方法或具体方法开启事务，并指定相关事务属性(一般配置到接口/类或者接口中的方法上)
    @Transactional(
            readOnly = false,
            timeout = -1,
            isolation = Isolation.DEFAULT,
            rollbackFor = {java.lang.ArithmeticException.class, IOException.class},
            noRollbackFor = {},
            propagation = Propagation.REQUIRED
    )
    public void transfer(String outName, String inName, Double money);


}
