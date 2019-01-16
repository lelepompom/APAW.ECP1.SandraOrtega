package es.upm.miw;

import java.util.ArrayList;
import java.util.List;

public class BookComposite extends BookComponent {

    private List<BookComponent> collection;

    public BookComposite(String name){
        super(name);
        this.collection = new ArrayList<>();
    }

    public List<BookComponent> getCollection() {
        return collection;
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
        return this.name;
    }
}
