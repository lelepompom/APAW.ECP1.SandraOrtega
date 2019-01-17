package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FeedbackTest {
    private FeedbackContext feedbackContext = new FeedbackContext();
    private FeedbackDec feedbackDec = new FeedbackDec("1");
    private FeedbackHex feedbackHex = new FeedbackHex("16");

    @BeforeEach
    void before(){
        feedbackContext.setFeedbackStrategy(feedbackDec);
    }

    @Test
    void testId(){
        assertEquals("1", this.feedbackDec.getId());
    }

    @Test
    void testGetLikes(){
        assertEquals("0", this.feedbackDec.getLikes().toString());
    }

    @Test
    void testSetTitle(){
        this.feedbackContext.giveFeedback();
        this.feedbackContext.giveFeedback();
        this.feedbackContext.giveFeedback();
        this.feedbackContext.giveFeedback();
        this.feedbackContext.giveFeedback();
        assertEquals("5", this.feedbackDec.getLikes().toString());
    }


    @Test
    void testHexId(){
        assertEquals("16", this.feedbackHex.getId());
    }

    @Test
    void testHexGetLikes(){
        feedbackContext.setFeedbackStrategy(feedbackHex);
        assertEquals("0", this.feedbackHex.getLikes());
    }

    @Test
    void testHexSetTitle(){
        feedbackContext.setFeedbackStrategy(feedbackHex);
        this.feedbackContext.giveFeedback();
        this.feedbackContext.giveFeedback();
        this.feedbackContext.giveFeedback();
        this.feedbackContext.giveFeedback();
        this.feedbackContext.giveFeedback();
        assertEquals("5", this.feedbackHex.getLikes());
    }
}
