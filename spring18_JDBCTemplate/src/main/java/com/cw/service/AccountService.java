package com.cw.service;

import com.cw.domain.Account;

import java.util.List;

public interface AccountService {

    void save(Account account);

    void delete(Integer id);

    void update(Account account);

    String findNameById(Integer id);

    Account findById(Integer id);

    List<Account> findAll();

    List<Account> findAll(int pageNum, int preNum);

    Long getCount();

}
