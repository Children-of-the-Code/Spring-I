package com.Revature.SpringProject;

import com.Revature.SpringProject.Service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;



//@ComponentScan
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        /*
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        BookService bookService = context.getBean(BookService.class);
        System.out.println(bookService.getAllBooks());
         */
        /*
        automatically configure spring and run our controller
         */
        SpringApplication.run(Application.class);

    }
}
/*
today:
spring core: essential model for all of spring,
manages dependency injection and IoC (inversion of control - control over dependencies is handed to spring)
creates an applicationContext from which we can grab spring beans (objects managed by spring)
Component, Autowired

spring MVC:
web controllers
we can create mappings, parse path parameters, map request / response bodies automatically

spring boot:
don't forget! even though we're using spring boot, it's a module on top of spring
spring boot removes the need for us to create an applicationcontext and do component scan / config ourselves
and it allows us to automatically configure spring to run a web application on MVC (because this is effectively
all spring is used for anyways)


let's start planning your project..
a couple of things you can and should do now
even though you don't have full knowledge about frontend and backend techs that we'll be using,
there's still a lot to plan

a) what tables (entities) will you need to accomplish the requirements? (eg - you need a user entity, maybe you need
a social media post, and social media posts are many-to-one with user entities)

b) what controller endpoints will you need? think from the perspective of the frontend - what information exactly
do you need to transfer between frontend and backend (eg what would it really take to add something to a users cart?)

 */