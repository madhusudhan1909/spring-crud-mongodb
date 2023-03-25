package com.example.springmongocrud.controller;

import com.example.springmongocrud.entity.Book;
import com.example.springmongocrud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.List;

public class findByoperation implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepo;

    @Override
    public void run(String... args) throws Exception {

        // findAll() : It will retireve all records saved into DB
        List<Book> bookList = bookRepo.findAll();
        bookList.forEach(System.out::println);     // Printing all saved books
    }
}