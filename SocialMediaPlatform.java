public class SocialMediaPlatform {

    public static void main(String[] args) {

        User nursel = new User("Nursel");
        User almina = new User("Almina");
        User belinay = new User("Belinay");

        nursel.follow(almina);
        nursel.follow(belinay);
        almina.follow(belinay);


        almina.createPost("Days are only as gray as you allow them to be");
        belinay.createPost("May the force be with you");
        nursel.createPost("Stay positive, work hard, make it happen!");


        nursel.addCommentToPost(almina, 0, "O zaman renk!");
        almina.addCommentToPost(belinay, 0, "A long time ago in a galaxy far, far away...");
        belinay.addCommentToPost(nursel, 0, "Great advice!");


        almina.addToPostFavorites(belinay, 0);
        nursel.addToPostFavorites(almina, 0);
        belinay.addToPostFavorites(nursel, 0);


        System.out.println("=== Almina'nın Feed'i ===");
        almina.showFeed();

        System.out.println("\n=== Nursel'in Feed'i ===");
        nursel.showFeed();

        System.out.println("\n=== Belinay'ın Feed'i ===");
        belinay.showFeed();


        System.out.println("\n=== Nursel'in Gönderileri ===");
        nursel.showPosts();

        System.out.println("\n=== Almina'nın Gönderileri ===");
        almina.showPosts();

        System.out.println("\n=== Belinay'ın Gönderileri ===");
        belinay.showPosts();
    }
}
