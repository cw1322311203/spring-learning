package com.cw.service.impl;


import com.cw.dao.AccountDao;
import com.cw.service.AccountService;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

 /*   // 编程式事务
    public void transfer(String outName, String inName, Double money) {
        // 开启事务，创建事务管理器，为事务管理器设置与数据层相同的数据源
        PlatformTransactionManager ptm = new DataSourceTransactionManager(dataSource);
        // 创建事务定义对象
        TransactionDefinition td = new DefaultTransactionDefinition();
        // 创建事务状态对象，用于控制事务执行
        TransactionStatus ts = ptm.getTransaction(td);

        accountDao.inMoney(outName, money);
        int i = 1 / 0;
        accountDao.outMoney(inName, money);
        // 提交事务
        ptm.commit(ts);
    }*/

    // 将业务层的事务处理功能抽取出来制作成AOP通知，利用环绕通知运行期动态织入
    public void transfer(String outName, String inName, Double money) {
        accountDao.inMoney(outName, money);
        int i = 1 / 0;
        accountDao.outMoney(inName, money);
    }


}
