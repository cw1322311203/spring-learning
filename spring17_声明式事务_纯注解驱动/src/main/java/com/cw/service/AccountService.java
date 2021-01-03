package com.cw.service;

import com.cw.domain.Account;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

public interface AccountService {

    @Transactional
    public void transfer(String outName, String inName, Double money);


}
