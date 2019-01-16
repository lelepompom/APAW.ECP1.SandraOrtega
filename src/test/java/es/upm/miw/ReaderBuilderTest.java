package es.upm.miw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReaderBuilderTest {
    private ReaderBuilder readerbuilder = new ReaderBuilder("14");

    @Test
    void testName() {
        this.readerbuilder.name("Paco").build();
        assertEquals("Paco", readerbuilder.build().getName());
    }

    @Test
    void testAge() {
        this.readerbuilder.age(43).name("Alba").build();
        assertEquals("43", readerbuilder.build().getAge().toString());
    }

}
