import java.util.*;

public class User {
    private String name;
    private LinkedHashMap<Integer, Post> posts;
    private HashSet<User> following;
    private TreeSet<Post> favorites;
    private static int postCounter = 0;

    public User(String name) {
        this.name = name;
        this.posts = new LinkedHashMap<>();
        this.following = new HashSet<>();
        this.favorites = new TreeSet<>(Comparator.comparing(Post::getId));
    }

    public String getName() {
        return name;
    }

    public void follow(User user) {
        following.add(user);
        System.out.println(name + ", " + user.getName() + " kullanıcısını takip ediyor\n");
    }

    public void createPost(String content) {
        Post newPost = new Post(postCounter++, this, content);
        posts.put(newPost.getId(), newPost);
        System.out.println(name + " yeni bir gönderi yayınladı: " + content + "\n");
    }

    public void addCommentToPost(User user, int postId, String comment) {
        Post post = user.getPost(postId);
        if (post != null) {
            post.addComment(new Comment(this, comment));
            System.out.println(name + ", " + user.getName() + "'in gönderisine yorum yaptı: " + comment + "\n") ;
        }
    }

    public void addToPostFavorites(User user, int postId) {
        Post post = user.getPost(postId);
        if (post != null) {
            favorites.add(post);
            System.out.println(name + ", " + user.getName() + "'in gönderisini beğendi: " + post.getContent());
        }
    }

    public void showFeed() {
        System.out.println("\n" + name + "'in Ana Sayfası:");
        for (User user : following) {
            Iterator<Post> iterator = user.posts.values().iterator();
            while (iterator.hasNext()) {
                Post post = iterator.next();
                System.out.println(user.getName() + ": " + post.getContent());
                for (Comment comment : post.getComments()) {
                    System.out.println("    " + comment.getAuthor().getName() + ": " + comment.getContent());
                }
            }
        }
    }

    public void showPosts() {
        for (Post post : posts.values()) {
            System.out.println(post.getAuthor().getName() + "'in postu: " + post.getContent());
            for (Comment comment : post.getComments()) {
                System.out.println("    " + comment.getAuthor().getName() + "'n yorumu: " + comment.getContent());
            }
        }
    }

    public Post getPost(int postId) {
        return posts.get(postId);
    }
}
