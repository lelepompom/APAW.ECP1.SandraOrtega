package es.upm.miw;

public class BookLeaf extends BookComponent {

    private Book book;

    public BookLeaf(Book book){
        super(book.getTitle(), book.getAuthor());
        this.book = book;
    }

    @Override
    public void add(BookComponent cc) {
        throw new UnsupportedOperationException("Unsupported Operation");
    }

    @Override
    public void remove(BookComponent cc) {
        throw new UnsupportedOperationException("Unsupported Operation");
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public String view() {
        return this.book.getId();
    }
}
