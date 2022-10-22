package org.xjh.spring.springLearn.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public interface AccountService {
    @Transactional
    void transfer(String out, String in, Double money);
}
