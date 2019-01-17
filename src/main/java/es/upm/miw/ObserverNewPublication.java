package es.upm.miw;

import org.apache.logging.log4j.LogManager;

public class ObserverNewPublication implements Observer {
    private  PublicationFactory publicationFactory;

    public ObserverNewPublication(PublicationFactory publicationFactory){
        this.publicationFactory = publicationFactory;
        this.publicationFactory.addObserver(this);
    }

    @Override
    public void update(String key) {
        String message = "New publication: nº" + this.publicationFactory.getPublication(key).getId() +
                " Title: " + this.publicationFactory.getPublication(key).getBook().getTitle() +
                " Author: " + this.publicationFactory.getPublication(key).getBook().getAuthor();

        LogManager.getLogger(this.getClass()).info(message);
    }
}
