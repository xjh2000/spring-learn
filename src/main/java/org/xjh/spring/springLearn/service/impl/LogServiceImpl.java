package org.xjh.spring.springLearn.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.xjh.spring.springLearn.dao.LogDao;
import org.xjh.spring.springLearn.service.LogService;

@Service
public class LogServiceImpl implements LogService {
    final LogDao logDao;

    public LogServiceImpl(LogDao logDao) {
        this.logDao = logDao;
    }

    @Override
    public void log(String out, String in, Double money) {
        logDao.log(out + " to " + in + " : " + money);
    }
}
