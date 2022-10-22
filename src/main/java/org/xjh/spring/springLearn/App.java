package org.xjh.spring.springLearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.xjh.spring.springLearn.config.SpringConfig;
import org.xjh.spring.springLearn.dao.AccountDao;
import org.xjh.spring.springLearn.domain.Account;

public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountDao accountDao = ctx.getBean(AccountDao.class);
        Account account = new Account();
        account.setName("xjh");
        account.setMoney(20.0);
        accountDao.save(account);

    }

}
