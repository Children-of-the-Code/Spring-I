package com.Revature.SpringProject;

import com.Revature.SpringProject.Service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;



@ComponentScan
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        BookService bookService = context.getBean(BookService.class);
        System.out.println(bookService.getAllBooks());
    }
}