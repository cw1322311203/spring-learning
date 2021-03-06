package com.cw.service.impl;


import com.cw.dao.AccountDao;
import com.cw.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public void transfer(String outName, String inName, Double money) {
        accountDao.inMoney(outName, money);
        int i = 1 / 0;
        accountDao.outMoney(inName, money);
    }


}
