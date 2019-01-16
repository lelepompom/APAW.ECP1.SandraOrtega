package es.upm.miw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookCompositeTest {

    private BookComposite bookComposite = new BookComposite("name1");

    private BookComposite bookComposite2 = new BookComposite("name2");

    private Book book1 = new Book();
    private Book book2 = new Book();

    private BookLeaf bookLeaf1 = new BookLeaf(book1);
    private BookLeaf bookLeaf2 = new BookLeaf(book2);

    @Test
    void testisComposite(){
        assertTrue(this.bookComposite.isComposite());
    }

    @Test
    void testView(){
        assertEquals("name1", this.bookComposite.view());
    }

    @Test
    void collectionSize(){
        assertEquals(0, this.bookComposite.getCollection().size());
    }

    @Test
    void add2Component(){
        bookComposite2.add(bookLeaf1);
        bookComposite2.add(bookLeaf2);
        assertEquals(2, this.bookComposite2.getCollection().size());
    }

    @Test
    void remove2Component(){
        bookComposite2.add(bookLeaf1);
        bookComposite2.add(bookLeaf2);
        this.bookComposite2.remove(bookLeaf1);
        assertEquals(1, this.bookComposite2.getCollection().size());
    }
}
