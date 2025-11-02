// Program357.java
import java.util.ArrayList;

public class Program357 {

    // --- Movie class ---
    static class Movie {
        private String title;
        private String director;
        private ArrayList<String> actors;
        private ArrayList<String> reviews;

        // Constructor
        public Movie(String title, String director) {
            this.title = title;
            this.director = director;
            this.actors = new ArrayList<>();
            this.reviews = new ArrayList<>();
        }

        // Add actor
        public void addActor(String actor) {
            actors.add(actor);
            System.out.println("🎭 Added actor: " + actor);
        }

        // Add review
        public void addReview(String review) {
            reviews.add(review);
            System.out.println("📝 Added review: \"" + review + "\"");
        }

        // Retrieve all reviews
        public void displayReviews() {
            System.out.println("\n=== 🎬 Reviews for \"" + title + "\" ===");
            if (reviews.isEmpty()) {
                System.out.println("No reviews yet.");
            } else {
                for (int i = 0; i < reviews.size(); i++) {
                    System.out.println((i + 1) + ". " + reviews.get(i));
                }
            }
        }

        // Display movie info
        public void displayMovieInfo() {
            System.out.println("\n=== 🎞️ Movie Information ===");
            System.out.println("Title: " + title);
            System.out.println("Director: " + director);
            System.out.println("Actors: ");
            if (actors.isEmpty()) {
                System.out.println("No actors listed.");
            } else {
                for (String actor : actors) {
                    System.out.println("- " + actor);
                }
            }
        }
    }

    // --- Main method ---
    public static void main(String[] args) {
        // Create movie objects
        Movie movie1 = new Movie("Inception", "Christopher Nolan");
        Movie movie2 = new Movie("Interstellar", "Christopher Nolan");

        // Add actors
        movie1.addActor("Leonardo DiCaprio");
        movie1.addActor("Joseph Gordon-Levitt");
        movie1.addActor("Elliot Page");

        movie2.addActor("Matthew McConaughey");
        movie2.addActor("Anne Hathaway");
        movie2.addActor("Jessica Chastain");

        // Add reviews
        movie1.addReview("A mind-bending masterpiece!");
        movie1.addReview("Brilliant direction and stunning visuals.");
        movie2.addReview("An emotional and visually spectacular journey.");
        movie2.addReview("One of Nolan’s best works.");

        // Display movie details and reviews
        movie1.displayMovieInfo();
        movie1.displayReviews();

        movie2.displayMovieInfo();
        movie2.displayReviews();
    }
}
