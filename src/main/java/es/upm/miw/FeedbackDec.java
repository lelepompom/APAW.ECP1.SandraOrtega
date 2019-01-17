package es.upm.miw;

public class FeedbackDec implements FeedbackStrategy {
    private String id;
    private Integer likes;

    public FeedbackDec(String id){
        this.id = id;
        this.likes = 0;
    }

    public String getId() {
        return id;
    }

    public Integer getLikes(){
        return this.likes;
    }

    @Override
    public int likes() {
        return this.likes++;
    }
}
