import Entities.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    private Book book;

    @BeforeEach
    void before(){
        this.book = new Book();
        this.book.setTitle("Design as art");
        this.book.setAuthor("Bruno Munari");
    }

    @Test
    void testTitle(){
        assertEquals("Design as art", this.book.getTitle());
    }

    @Test
    void testAuthor() {
        assertEquals("Bruno Munari", this.book.getAuthor());
    }
}
