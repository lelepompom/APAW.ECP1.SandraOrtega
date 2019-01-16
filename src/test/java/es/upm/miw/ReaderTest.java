package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReaderTest {
    private Reader reader;

    @BeforeEach
    void before() {
        this.reader = new Reader("Almudena", 25);
    }

    @Test
    void testId(){
        assertEquals("", this.reader.getId());
    }

    @Test
    void testGetName() {
        assertEquals("Almudena", reader.getName());
    }

    @Test
    void testSetName() {
        reader.setName("Almu");
        assertEquals("Almu", reader.getName());
    }

    @Test
    void testGetAge() {
        assertEquals("25", reader.getAge().toString());
    }

    @Test
    void testSetAge() {
        reader.setAge(41);
        assertEquals("41", reader.getAge().toString());
    }

}
