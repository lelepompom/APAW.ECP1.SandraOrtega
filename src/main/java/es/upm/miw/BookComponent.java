package es.upm.miw;

public abstract class BookComponent {

    public String name;

    public BookComponent(String name){
        this.name = name;
    }

    public abstract void add(BookComponent cc);

    public abstract void remove(BookComponent cc);

    public abstract boolean isComposite();

    public abstract String view();
}
