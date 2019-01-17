package es.upm.miw;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.toHexString;

public class FeedbackHex implements FeedbackStrategy {
    private String id;
    private String likes;

    public FeedbackHex(String id){
        this.id = id;
        this.likes = "0";
    }

    public String getId() {
        return id;
    }

    public String getLikes(){
        return this.likes;
    }

    @Override
    public int likes() {
        this.likes = toHexString(parseInt(this.likes, 16) + 1);
        return Integer.parseInt(this.likes);
    }
}
