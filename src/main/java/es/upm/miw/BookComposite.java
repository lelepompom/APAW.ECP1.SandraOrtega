package es.upm.miw;

import java.util.ArrayList;
import java.util.List;

public class BookComposite extends BookComponent {

    private List<BookComponent> collection;

    public BookComposite(String title, String author){
        super(title, author);
        this.collection = new ArrayList<>();
    }

    @Override
    public void add(BookComponent cc) {
        assert cc != null;
        collection.add(cc);
    }

    @Override
    public void remove(BookComponent cc) {
        assert cc != null;
        collection.remove(cc);
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    public String view() {
        return collection.stream().toString();
    }
}
