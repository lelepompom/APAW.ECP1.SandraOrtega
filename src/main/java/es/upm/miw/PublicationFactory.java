package es.upm.miw;

import java.util.HashMap;
import java.util.Map;

public class PublicationFactory extends Observable {

    private static final PublicationFactory publicationFactory = new PublicationFactory();

    private Map<String, Publication> publicationRegister;

    private PublicationFactory() {
        this.publicationRegister = new HashMap<>();
    }

    public static PublicationFactory getFactory() {
        return publicationFactory;
    }

    public Publication getPublication(String key) {
        return publicationRegister.get(key);
    }

    public void setPublication(Publication publication){
        publicationRegister.put(publication.getId(),publication);
        this.notifyObservers(publication.getId());
    }

    public void removePublication(String key){
        this.publicationRegister.remove(key);

    }

}
