package org.xjh.spring.springLearn.service.impl;

import org.springframework.stereotype.Service;
import org.xjh.spring.springLearn.dao.AccountDao;
import org.xjh.spring.springLearn.service.AccountService;
import org.xjh.spring.springLearn.service.LogService;

@Service
public class AccountServiceImpl implements AccountService {
    final AccountDao accountDao;
    final LogService logService;

    public AccountServiceImpl(AccountDao accountDao, LogService logService) {
        this.accountDao = accountDao;
        this.logService = logService;
    }

    @Override
    public void transfer(String out, String in, Double money) {
        try {
            accountDao.outMoney(out, money);
            int i = 1 / 0;
            accountDao.inMoney(in, money);
        } finally {
            logService.log(out, in, money);
        }
    }
}
