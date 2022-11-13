package liskov.posts;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Post> posts = new LinkedList<>();
        posts.add(new Post("Original Post"));
        posts.add(new MentionPost("Mention Post"));
        posts.add(new LinkedPost("Linked Post"));

        // TODO: here all these posts are from different types of posts.
        // TODO: when try to post function it always do the base createPost() function.
        for (Post post : posts){
            System.out.println(post.createPost());
        }
    }
}
