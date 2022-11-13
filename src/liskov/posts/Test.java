package liskov.posts;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Post> posts = new LinkedList<>();
        posts.add(new Post("Original Post"));
        posts.add(new MentionPost("Mention Post"));
        posts.add(new LinkedPost("Linked Post"));
        posts.add(new HashtagPost("Tagged Post"));

        // I solved this problem by use one base function createPost()
        // and override this fun. from every class I create
        for (Post post : posts){
            System.out.println(post.createPost());
        }
    }
}
