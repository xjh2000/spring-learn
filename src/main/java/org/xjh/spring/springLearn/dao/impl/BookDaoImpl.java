package org.xjh.spring.springLearn.dao.impl;

import org.springframework.stereotype.Component;
import org.xjh.spring.springLearn.dao.BookDao;

@Component
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book is save");
    }
}
