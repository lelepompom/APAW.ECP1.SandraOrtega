import Entities.Publication;

import java.util.HashMap;
import java.util.Map;

public class PublicationFactory {

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

    public Publication setPublication(Publication publication){
        return publicationRegister.put(publication.getId(),publication);
    }

    public void removePublication(String key){
        this.publicationRegister.remove(key);

    }

}
