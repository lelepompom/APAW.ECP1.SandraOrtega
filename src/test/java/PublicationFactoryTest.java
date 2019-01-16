import Entities.Book;
import Entities.Publication;
import Entities.Reader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class PublicationFactoryTest {

    private PublicationFactory publicationFactory = PublicationFactory.getFactory();
    private Publication publication1 = new Publication("1");
    private Publication publication2 = new Publication("2");
    private Book book1 = new Book();
    private List<Reader> readers;

    @BeforeEach
    void before() {
        this.book1.setTitle("Design as art");
        this.book1.setAuthor("Bruno Munari");
        this.readers = Stream
                .of(
                        new Reader("Sonia", 27),
                        new Reader("Almudena", 25),
                        new Reader("Mario", 24)
                )
                .collect(Collectors.toList());

        this.publication1.setBook(book1);
        this.publication1.setSigned(true);
        this.publication1.setReaders(readers);

        this.publicationFactory.setPublication(publication1);
    }

    @Test
    void testNoPublication() {
        assertNull(publicationFactory.getPublication("3"));
    }

    @Test
    void testSignedPublication1() {
        assertTrue(publicationFactory.getPublication("1").getSigned());
    }

    @Test
    void testSignedPublication2() {
        assertFalse(publicationFactory.getPublication("2").getSigned());
    }

    @Test
    void testSetPublication2() {
        this.publicationFactory.setPublication(publication2);
        assertEquals(publication2, publicationFactory.getPublication("2"));
    }

    @Test
    void testRemovePublication2() {
        publicationFactory.removePublication("2");
        assertNull(publicationFactory.getPublication("2"));
    }

}
