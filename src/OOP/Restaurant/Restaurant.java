// Write a Java program to create a class called "Restaurant" with attributes for menu items, prices, and ratings, and
// methods to add and remove items, and to calculate average rating.
package OOP.Restaurant;

import java.util.ArrayList;
public class Restaurant {
    private ArrayList<String> menuItems;
    private ArrayList<Double> prices;
    private ArrayList<Integer> ratings;
    private ArrayList<Integer> itemCounts;
    public Restaurant() {
        this.menuItems = new ArrayList<>();
        this.prices = new ArrayList<>();
        this.ratings = new ArrayList<>();
        this.itemCounts = new ArrayList<>();
    }
    public void addItem(String item, double price) {
        if (menuItems.contains(item)) {
            System.out.println("Item already exists in the menu.");
        } else {
            this.menuItems.add(item);
            this.prices.add(price);
            this.ratings.add(0);
            this.itemCounts.add(0);
        }
    }
    public void removeItem(String item) {
        if (menuItems.contains(item)) {
            int index = menuItems.indexOf(item);
            this.menuItems.remove(index);
            this.prices.remove(index);
            this.ratings.remove(index);
            this.itemCounts.remove(index);
        } else {
            System.out.println("Item does not exist in the menu.");
        }
    }
    public void addRating(String item, int rating) {
        int index = this.menuItems.indexOf(item);
        if (menuItems.contains(item)) {
            int currentRating = this.ratings.get(index);
            int totalCount = this.itemCounts.get(index);
            this.ratings.set(index, currentRating + rating);
            this.itemCounts.set(index, totalCount + 1);
        }
    }
    public double getAverageRating(String item) {
        int index = this.menuItems.indexOf(item);
        if (menuItems.contains(item)) {
            int totalRating = this.ratings.get(index);
            int itemCount = this.itemCounts.get(index);
            return itemCount > 0 ? (double) totalRating / itemCount : 0.0 ;
        } else {
            return 0.0;
        }
    }
    public void displayMenu() {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i) + ": $" + prices.get(i));
        }
    }
    public double calculateAverageRating() {
        double totalRating = 0;
        int numRatings = 0;
        for (int i = 0; i < ratings.size(); i++) {
            totalRating += ratings.get(i);
            numRatings += 1;
        }
        return numRatings > 0 ? totalRating / numRatings : 0.0;
    }
}