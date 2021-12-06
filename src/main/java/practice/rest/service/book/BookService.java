package practice.rest.service.book;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@Service
public class BookService {
    public List<Books> getBooksList(){
        return Arrays.asList(
                new Books("1", "Can't Hurt Me", "David Goggins"),
                new Books("2", "The Power Of Habit", "Charles Duhigg"),
                new Books("3", "Elon Musk", "Ashlee Vance"),
                new Books("4", "Zero To One", "Peter Thiel")
        );
    }

    public Books getBookByName(final String bookName){
        Predicate<Books> name = p -> p.getBookName().contains(bookName);
        return filterBookByName(name);
    }


    private Books filterBookByName(Predicate<Books> id) {
        return getBooksList().stream().filter(id).findFirst().orElse(null);
    }

    public Books addBook(Books newBook){
        newBook.setBookId("5");
        return newBook;
    }
}
