package OOP.Restaurant;
public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.addItem("Burger", 8.99);
        restaurant.addItem("Pizza", 10.99);
        restaurant.addItem("Salad", 6.99);
        restaurant.displayMenu();
        restaurant.addRating("Burger", 5);
        restaurant.addRating("Burger", 4);
        restaurant.addRating("Burger", 3);
        restaurant.addRating("Pizza", 5);
        restaurant.addRating("Pizza", 4);
        restaurant.addRating("Pizza", 3);
        restaurant.addRating("Salad", 5);
        restaurant.addRating("Salad", 4);
        restaurant.addRating("Salad", 3);
        // Get the average rating for the Burger item
        double averageRating = restaurant.getAverageRating("Burger");
        // Print the average rating for the Burger item
        System.out.println("\nAverage rating for Burger: " + averageRating);
        // Get the average rating for the Pizza item
        averageRating = restaurant.getAverageRating("Pizza");
        // Print the average rating for the Pizza item
        System.out.println("Average rating for Pizza: " + averageRating);
        // Get the average rating for the Salad item
        averageRating = restaurant.getAverageRating("Salad");
        // Print the average rating for the Salad item
        System.out.println("Average rating for Salad: " + averageRating);
        // Print the overall average rating for all items
        System.out.println("Average rating: " + restaurant.calculateAverageRating());
        restaurant.removeItem("Salad");
        System.out.println("Removed Salad from the menu. Updated menu:");
        restaurant.displayMenu();
    }
}