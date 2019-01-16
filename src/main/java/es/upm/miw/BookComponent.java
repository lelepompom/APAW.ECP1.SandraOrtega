package es.upm.miw;

public abstract class BookComponent {

    private String title;
    private String author;

    public BookComponent(String title, String author){
        this.title = title;
        this.author = author;
    }

    public abstract void add(BookComponent cc);

    public abstract void remove(BookComponent cc);

    public abstract boolean isComposite();

    public abstract String view();
}
