package org.xjh.spring.springLearn.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.xjh.spring.springLearn.config.SpringConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {
    @Autowired
    AccountService accountService;

    @Test
    public void transfer() {
//        accountService.transfer("xjh1", "xjh2", 100.0);
        accountService.transfer("xjh2", "xjh1", 100.0);
    }
}