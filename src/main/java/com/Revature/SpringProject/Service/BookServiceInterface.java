package com.Revature.SpringProject.Service;

import com.Revature.SpringProject.Model.Book;

import java.util.List;

public interface BookServiceInterface {
    public List<Book> getAllBooks();
    public Book getBookByName(String name);
    public void addBook(Book book);
}
