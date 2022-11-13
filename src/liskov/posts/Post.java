package liskov.posts;

public class Post {
    PostDatabase postDatabase ;
    String content ;

    public Post(String content) {
        this.postDatabase = new PostDatabase();
        this.content = content;
    }

    public String createPost(){
        return postDatabase.addOriginalPost(this.content);
    }
}

