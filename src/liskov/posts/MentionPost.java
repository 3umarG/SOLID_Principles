package liskov.posts;

public class MentionPost extends Post {

    public MentionPost(String content) {
        super(content);
    }

    @Override
    public String createPost() {
        return this.postDatabase.addMentionPost(this.content);
    }
}
