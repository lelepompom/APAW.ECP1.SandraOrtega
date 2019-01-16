package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BookLeafTest {

    private Book book = new Book();
    private BookLeaf bookLeaf = new BookLeaf(book);

    @BeforeEach
    void before(){
        this.book.setTitle("Design as art");
        this.book.setAuthor("Bruno Munari");
    }

    @Test
    void testisComposite(){
        assertFalse(this.bookLeaf.isComposite());
    }

    @Test
    void testView(){
        assertEquals("", this.bookLeaf.view());
    }

    @Test
    void cannotAdd(){
        assertThrows(UnsupportedOperationException.class, () -> this.bookLeaf.add(new BookComposite("", "")));
    }

    @Test
    void cannotRemove(){
        assertThrows(UnsupportedOperationException.class, () -> this.bookLeaf.remove(new BookComposite("", "")));
    }
}
