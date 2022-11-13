package liskov.posts;

public class LinkedPost extends Post{

    public LinkedPost(String content) {
        super(content);
    }

    public String createLinkedPost(){
        return super.postDatabase.addLinkedPost(this.content);
    }
}
