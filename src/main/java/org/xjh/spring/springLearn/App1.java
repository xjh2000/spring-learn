package org.xjh.spring.springLearn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.xjh.spring.springLearn.config.SpringConfig;
import org.xjh.spring.springLearn.dao.BookDao;
import org.xjh.spring.springLearn.service.BookService;

public class App1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(SpringConfig.class);
        context.refresh();

        BookDao bookDao = (BookDao) context.getBean(BookDao.class);
        bookDao.save();

        System.out.println("===========");
        System.out.println("===========");

        BookService bookService = (BookService) context.getBean(BookService.class);
        bookService.save();
    }
}
