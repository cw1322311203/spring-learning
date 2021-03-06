package com.cw.service;

import com.cw.domain.Account;

import java.util.List;

/**
 * @author 陈小哥cw
 * @date 2020/12/28 16:11
 */
public interface AccountService {
    void save(Account account);

    void delete(Integer id);

    void update(Account account);

    List<Account> findAll();

    Account findById(Integer id);
}
