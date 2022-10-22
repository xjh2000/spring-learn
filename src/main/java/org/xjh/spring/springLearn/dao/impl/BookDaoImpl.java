package org.xjh.spring.springLearn.dao.impl;

import org.xjh.spring.springLearn.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book is save");
    }
}
