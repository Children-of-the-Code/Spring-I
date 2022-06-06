package com.Revature.SpringProject.Service;

import com.Revature.SpringProject.Model.Book;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookService implements BookServiceInterface{
    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public Book getBookByName() {
        return null;
    }

    @Override
    public void addBook() {

    }
}
