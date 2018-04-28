package com.learning.microservices.springbootdemo;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class BookController {

    Book book;

    @GetMapping("/books")
    public List<Book> getBooks(){
        return Arrays.asList(new Book(1,"Java","Me"),new Book(2,"Java9","NoIdea"));
    }


}

