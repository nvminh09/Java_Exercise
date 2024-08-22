// Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews, and
// methods for adding and retrieving reviews.
package OOP.Movie;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String director;
    private ArrayList<String> actors;
    private ArrayList<Review> reviews;
    public Movie(String title, String director, ArrayList<String> actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new ArrayList<Review>();
    }
    public void addReview(Review review) {
        reviews.add(review);
    }
    public ArrayList<Review> getReview() {
        return this.reviews;
    }
    public String getTitle() {
        return this.title;
    }
    public String getDirector() {
        return this.director;
    }
    public ArrayList<String> getActors() {
        return this.actors;
    }
    public void printReview() {
        for (Review review : getReview()) {
            System.out.println(review.getReviewText() + " by " + review.getReviewerName() + " - " + review.getRating());
        }
    }
}