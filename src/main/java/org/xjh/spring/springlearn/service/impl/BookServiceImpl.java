package org.xjh.spring.springlearn.service.impl;

import org.xjh.spring.springlearn.dao.BookDao;
import org.xjh.spring.springlearn.dao.impl.BookDaoImpl;
import org.xjh.spring.springlearn.service.BookService;

public class BookServiceImpl implements BookService {
    private final BookDao bookDao = new BookDaoImpl();

    @Override
    public void save() {
        bookDao.save();
    }
}
