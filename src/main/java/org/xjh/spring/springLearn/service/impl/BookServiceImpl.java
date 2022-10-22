package org.xjh.spring.springLearn.service.impl;

import org.xjh.spring.springLearn.dao.BookDao;
import org.xjh.spring.springLearn.service.BookService;

public class BookServiceImpl implements BookService {
    //    private final BookDao bookDao = new BookDaoImpl();
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("service is save ");
        bookDao.save();

    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
