package liskov.posts;

public class Post implements CreatePost {
    PostDatabase postDatabase ;
    String content ;

    public Post(String content) {
        this.postDatabase = new PostDatabase();
        this.content = content;
    }


    @Override
    public String createPost() {
        return this.postDatabase.addOriginalPost(this.content);
    }
}

