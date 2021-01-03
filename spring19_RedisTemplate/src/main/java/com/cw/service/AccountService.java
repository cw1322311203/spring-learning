package com.cw.service;

import com.cw.domain.Account;

import java.util.List;

public interface AccountService {

    void save(Account account);

    void changeMoney(Integer id, Double money);

    Double findMondyById(Integer id);
}
