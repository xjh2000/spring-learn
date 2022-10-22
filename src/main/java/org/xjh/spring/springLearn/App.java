package org.xjh.spring.springLearn;

import org.xjh.spring.springLearn.service.impl.BookServiceImpl;

public class App {

    public static void main(String[] args) {
        BookServiceImpl bookService = new BookServiceImpl();
        bookService.save();
    }

}
