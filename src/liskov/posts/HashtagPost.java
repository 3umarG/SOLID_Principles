package liskov.posts;

public class HashtagPost extends Post {

    public HashtagPost(String content) {
        super(content);
    }

    @Override
    public String createPost() {
        return this.postDatabase.addTaggedPost(this.content);
    }
}
