package liskov.posts;

public class MentionPost extends Post {

    public MentionPost(String content) {
        super(content);
    }

    public String createMentionPost() {
        return postDatabase.addMentionPost(this.content);
    }
}
