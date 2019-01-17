package es.upm.miw;

public class FeedbackContext {
    private FeedbackStrategy feedbackStrategy;


    public void setFeedbackStrategy(FeedbackStrategy feedbackStrategy){
        this.feedbackStrategy = feedbackStrategy;
    }

    public void giveFeedback(){
        feedbackStrategy.likes();
    }
}
