package com.example.springmongocrud.controller;

import com.example.springmongocrud.entity.Book;
import com.example.springmongocrud.repository.BookRepository;
import org.apache.el.parser.AstGreaterThan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
//
//@Component
//public class SaveOperationRunner implements CommandLineRunner {
//
//    @Autowired
//    private BookRepository bookRepo;
//
//    @Override
//    public void run(String... args) throws Exception {
//////        // saveAll() operation : saveAll() inserts more than one records at a time
////
////        bookRepo.saveAll(Arrays.asList(
////                new Book(501, "Core Java", "Kathy Sierra", 1065.5),
////                new Book(502, "Spring in Action", "Craig Walls", 940.75),
////                new Book(503, "Hibernate in Action", "Gavin King", 889.25),
////                new Book(504, "Practical MongoDB", "Shakuntala Gupta", 785.0)
////        ));
////
////        // save() operation : Updating ID(PK) manually (allowed) : It will create one new record
////
////        Book book = bookRepo.save(new Book("ISBN10:1484240251", 504,"Practical MongoDB", "Shakuntala Gupta", 785.0));  // insert
////
////        // save() operation : save() also updates record based on the PK
////
////        bookRepo.save(new Book("ISBN10:1484240251", 505,"Practical MongoDB", "Shakuntala Gupta", 728.0));  // update
////        bookRepo.save(new Book(book.getId(), 505,"Practical MongoDB", "Navin Sabharwal", 798.0));  // update
//
//        // insert() operation : This method will also insert one new record
//
//        bookRepo.insert(new Book(508," Design Patterns", "Kaierra", 924.0)); // insert
//
//        System.out.println("All Data saved into MongoDB");
        @RestController
        @RequestMapping("/api/books")
        class BookController {
            @Autowired
            private BookRepository bookRepository;

            @GetMapping("/ids")
            public List<String> getBookIds() {
                List<Book> books = bookRepository.findAll();
                return books.stream().map(Book::getId).collect(Collectors.toList());

            }
            }
//         @GetMapping("/cost")
//          public List<Integer> getBookCost() {
//             List<Book> books = bookRepository.findAll();
//             return books.stream().map(Book::getBookCost). filter (book->book.getBookCost(). collect (Collectors.toList());
//            }
//        }


