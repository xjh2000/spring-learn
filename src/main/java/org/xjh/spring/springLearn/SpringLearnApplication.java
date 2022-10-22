package org.xjh.spring.springLearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.xjh.spring.springLearn.config.SpringConfig;
import org.xjh.spring.springLearn.service.BookService;

public class SpringLearnApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = applicationContext.getBean(BookService.class);
        bookService.save();
        bookService.delete();
    }

}
