package org.xjh.spring.springLearn.service.impl;

import org.springframework.stereotype.Repository;
import org.xjh.spring.springLearn.service.BookService;

@Repository
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("save ing ....");
    }

    @Override
    public void delete() {
        System.out.println("delete ing ....");

    }
}
