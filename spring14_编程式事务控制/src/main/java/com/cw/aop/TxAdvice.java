package com.cw.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;

/**
 * @author 陈小哥cw
 * @date 2021/1/2 21:45
 */
public class TxAdvice {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // 使用AOP控制事务
    public Object transactionManager(ProceedingJoinPoint pjp) throws Throwable {
        // 开启事务，创建事务管理器，为事务管理器设置与数据层相同的数据源
        PlatformTransactionManager ptm = new DataSourceTransactionManager(dataSource);
        // 创建事务定义对象
        TransactionDefinition td = new DefaultTransactionDefinition();
        // 创建事务状态对象，用于控制事务执行
        TransactionStatus ts = ptm.getTransaction(td);

        Object ret = pjp.proceed(pjp.getArgs());

        // 提交事务
        ptm.commit(ts);
        return ret;
    }
}
