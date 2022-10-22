package org.xjh.spring.springlearn.dao.impl;

import org.xjh.spring.springlearn.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book is save");
    }
}
