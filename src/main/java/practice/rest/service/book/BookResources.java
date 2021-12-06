package practice.rest.service.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookResources {

    @Autowired
    BookService bookService;

    private Books books;

    @GetMapping("/all")
    public List<Books> getBookList() {
        return bookService.getBooksList();
    }

    @GetMapping("/{bookName}")
    public ResponseEntity<Books> getBookByName(@PathVariable("bookName") String bookName){
        books = bookService.getBookByName(bookName);
        if(books == null){
            return new ResponseEntity<>(books, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Books addBook(@RequestBody Books newBook){
        return bookService.addBook(newBook);
    }

}
