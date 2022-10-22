package org.xjh.spring.springLearn.service.impl;

import org.springframework.stereotype.Component;
import org.xjh.spring.springLearn.dao.BookDao;
import org.xjh.spring.springLearn.service.BookService;

@Component
public class BookServiceImpl implements BookService {
    //    private final BookDao bookDao = new BookDaoImpl();
    private BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("service is save ");
        bookDao.save();

    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
