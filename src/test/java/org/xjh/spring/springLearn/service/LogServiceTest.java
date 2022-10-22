package org.xjh.spring.springLearn.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.xjh.spring.springLearn.config.SpringConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class LogServiceTest {
    @Autowired
    LogService logService;

    @Test
    public void log() {
        logService.log("xjh1", "xjh2", 100D);
    }

}