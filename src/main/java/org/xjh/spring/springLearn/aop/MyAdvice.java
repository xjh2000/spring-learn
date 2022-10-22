package org.xjh.spring.springLearn.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void org.xjh.spring.springLearn.service.impl.BookServiceImpl.delete())")
    private void fn() {
    }

    @Before("fn()")
    public void record() {
        System.out.println(System.currentTimeMillis());
    }
}
