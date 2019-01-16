package es.upm.miw;

public class ReaderBuilder {
    private Reader reader;

    public ReaderBuilder(String id){
        this.reader = new Reader(id);
    }

    public ReaderBuilder name(String name) {
        this.reader.setName(name);
        return this;
    }

    public ReaderBuilder age(int age) {
        this.reader.setAge(age);
        return this;
    }

    public Reader build() {
        return this.reader;
    }
}
