package org.xjh.spring.springLearn.service.impl;

import org.xjh.spring.springLearn.dao.AccountDao;
import org.xjh.spring.springLearn.service.AccountService;


public class AccountServiceImpl implements AccountService {
    final AccountDao accountDao;

    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out, money);
        accountDao.inMoney(in, money);
    }
}
