package com.Revature.SpringProject.Controller;

import com.Revature.SpringProject.Model.Book;
import com.Revature.SpringProject.Service.BookService;
import com.Revature.SpringProject.Service.BookServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {
    BookService bookService;
    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    @GetMapping("")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
    @GetMapping("{name}")
    public Book getBookByName(@PathVariable String name){
        return bookService.getBookByName(name);
    }
//    requestbody will automatically map the http request to a java object
    @PostMapping("")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }
    @DeleteMapping("{name}")
    public void deleteBookByName(@PathVariable String name){
        bookService.deleteBookByName(name);
    }
    @GetMapping("/name/{author}")
    public Book getBookByAuthor(@PathVariable String author){
//        completed?
        return null;
    }
}