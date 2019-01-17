package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PublisherSubscriberTest {

    private PublicationFactory publicationFactory = PublicationFactory.getFactory();
    private ObserverNewPublication observerNewPublication = new ObserverNewPublication(publicationFactory);

    private Publication publication = new Publication("8");
    private Publication newPublication = new Publication("9");
    private Book book = new Book();
    private Book yerma = new Book();

    @BeforeEach
    void before(){
        this.book.setTitle("Design as art");
        this.book.setAuthor("Bruno Munari");
        this.publication.setBook(book);

        this.yerma.setTitle("Yerma");
        this.yerma.setAuthor("Lorca");
        this.newPublication.setBook(yerma);

    }

    @Test
    void testSubscription() {
        this.publicationFactory.setPublication(publication);
    }

    @Test
    void testUnsubscription() {
        this.publicationFactory.removeObserver(observerNewPublication);
        this.publicationFactory.setPublication(publication);
        this.publicationFactory.setPublication(newPublication);
    }
}
