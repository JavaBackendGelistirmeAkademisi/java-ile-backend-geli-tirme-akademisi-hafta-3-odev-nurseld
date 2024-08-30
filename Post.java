import java.util.ArrayList;
import java.util.List;

public class Post {
    private int id;
    private User author;
    private String content;
    private List<Comment> comments;

    public Post(int id, User author, String content) {
        this.id = id;
        this.author = author;
        this.content = content;
        this.comments = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public User getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public List<Comment> getComments() {
        return comments;
    }
}
