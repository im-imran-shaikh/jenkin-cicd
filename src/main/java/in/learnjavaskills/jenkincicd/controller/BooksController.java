package in.learnjavaskills.jenkincicd.controller;

import in.learnjavaskills.jenkincicd.dto.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book/")
public class BooksController
{
    @GetMapping()
    public ResponseEntity<List<Book>> getAllBooks()
    {
        List<Book> bookList = new ArrayList();
        Book book1 = new Book("Mark", "Mark's first book");
        Book book2 = new Book("John", "John's first book");
        bookList.add(book1);
        bookList.add(book2);
        return ResponseEntity.ok(bookList);
    }
}
