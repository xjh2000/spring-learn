package org.xjh.spring.springlearn;

import org.xjh.spring.springlearn.service.impl.BookServiceImpl;

public class SpringLearnApplication {

    public static void main(String[] args) {
        BookServiceImpl bookService = new BookServiceImpl();
        bookService.save();
    }

}
