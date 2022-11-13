package liskov.posts;

public class LinkedPost extends Post{

    public LinkedPost(String content) {
        super(content);
    }

    @Override
    public String createPost() {
        return super.postDatabase.addLinkedPost(this.content);
    }
}
