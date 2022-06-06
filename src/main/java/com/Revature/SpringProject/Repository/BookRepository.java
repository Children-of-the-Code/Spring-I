package com.Revature.SpringProject.Repository;

import com.Revature.SpringProject.Model.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class BookRepository {
    public void addBook(Book book){
        System.out.println(book);
    }
    public List<Book> getAllBooks(){
        return new ArrayList<Book>();
    }
    public Book getBookByName(String name){
        return new Book(0, name, "author");
    }
    public void deleteBookByName(String name){
        System.out.println("deleted book " + name);
    }
}
