package liskov.posts;

public class PostDatabase {

    public String addOriginalPost(String post) {
        return "Add Original Post : " + post + " to DB";
    }

    public String addMentionPost(String post){
        return "Add Mention Post : " + post + " to DB";
    }

    public String addTaggedPost(String post){
        return "Add Tagged Post : " + post + " to DB";
    }

    public String addLinkedPost(String post){
        return "Add Linked Post : " + post + " to DB";
    }


}
