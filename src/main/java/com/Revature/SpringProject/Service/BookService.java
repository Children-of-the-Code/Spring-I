package com.Revature.SpringProject.Service;

import com.Revature.SpringProject.Model.Book;
import com.Revature.SpringProject.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookService implements BookServiceInterface{

    BookRepository bookRepository;

    /*
    autowired will automatically wire a bean to this class
    particularly useful in the case of eg singleton beans - a single object can be shared
    by multiple objects - spring takes care of this for us
     */
    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    @Override
    public Book getBookByName(String name) {
        return bookRepository.getBookByName(name);
    }

    @Override
    public void addBook(Book book) {
        bookRepository.addBook(book);
    }
    public void deleteBookByName(String name){
        bookRepository.deleteBookByName(name);
    }
}
