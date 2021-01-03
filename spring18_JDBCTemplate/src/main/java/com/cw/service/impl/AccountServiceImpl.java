package com.cw.service.impl;


import com.cw.dao.AccountDao;
import com.cw.domain.Account;
import com.cw.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public void save(Account account) {
        accountDao.save(account);
    }

    public void delete(Integer id) {
        accountDao.delete(id);
    }

    public void update(Account account){
        accountDao.update(account);
    }

    public String findNameById(Integer id) {
        return accountDao.findNameById(id);
    }

    public Account findById(Integer id) {
        return accountDao.findById(id);
    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public List<Account> findAll(int pageNum, int preNum) {
        return accountDao.findAll(pageNum,preNum);
    }

    public Long getCount() {
        return accountDao.getCount();
    }
}
