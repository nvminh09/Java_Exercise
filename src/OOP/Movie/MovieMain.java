package OOP.Movie;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieMain {
    public static void main(String[] args) {
        // Create a movie object for "Titanic"
        Movie movie1 = new Movie("Titanic", "James Cameron", new ArrayList(Arrays.asList("Leonardo DiCaprio", "Kate Winslet")));
        // Create review objects
        Review review1 = new Review("Great movie!", "Irvine Rolf", 4.5);
        Review review2 = new Review("Highly recommended!", "Ashkii Karlheinz", 4.5);
        Review review3 = new Review("A classic that never gets old.", "Nele Athol", 4.0);
        Review review4 = new Review("Great movie!", "Cipactli Anselma", 4.0);
        Review review5 = new Review("Highly recommended!", "Martin Nadine", 4.0);
        movie1.addReview(review1);
        movie1.addReview(review2);
        movie1.addReview(review3);
        movie1.addReview(review4);
        movie1.addReview(review5);
        // Display the movie object
        System.out.println("Title: " + movie1.getTitle());
        System.out.println("Director: " + movie1.getDirector());
        System.out.println("Actors: " + movie1.getActors());
        // Display the reviews
        System.out.println("\nReviews for " + movie1.getTitle() + ":");
        movie1.printReview();

        // Create a movie object for "The Godfather"
        Movie movie2 = new Movie("The Godfather", "Francis Ford Coppola", new ArrayList(Arrays.asList("Marlon Brando", "Al Pacino", "James Caan")));
        // Create review objects
        Review review6 = new Review("Great movie!", "Irvine Rolf", 4.5);
        Review review7 = new Review("Highly recommended!", "Ashkii Karlheinz", 4.5);
        Review review8 = new Review("A classic that never gets old.", "Nele Athol", 4.0);
        Review review9 = new Review("Great movie!", "Cipactli Anselma", 4.0);
        // Add reviews to the movie object
        movie2.addReview(review6);
        movie2.addReview(review7);
        movie2.addReview(review8);
        movie2.addReview(review9);
        // Display the movie object
        System.out.println("\nTitle: " + movie2.getTitle());
        System.out.println("Director: " + movie2.getDirector());
        System.out.println("Actors: " + movie2.getActors());
        // Display the reviews
        System.out.println("\nReviews for " + movie2.getTitle() + ":");
        movie2.printReview();
    }
}