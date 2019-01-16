package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FeedbackTest {
    private Feedback feedback;

    @BeforeEach
    void before(){
        this.feedback = new Feedback("1", 3);
    }

    @Test
    void testId(){
        assertEquals("1", this.feedback.getId());
    }

    @Test
    void testGetLikes(){
        assertEquals("3", this.feedback.getLikes().toString());
    }

    @Test
    void testSetTitle(){
        this.feedback.setLikes(5);
        assertEquals("5", this.feedback.getLikes().toString());
    }
}
