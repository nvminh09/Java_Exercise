package OOP.Customer;
public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John Doe", "johndoe@gmail.com");
        customer1.addPurchase(100);
        customer1.addPurchase(200);
        System.out.println(customer1.getName() + "has total expenditure: " +  + customer1.totalExpenditure());
        // Create a loyal customer with a discount rate
        LoyalCustomer loyalCustomer1 = new LoyalCustomer("Jane Doe", "johndoe@gmail.com", 10);
        loyalCustomer1.addPurchase(100);
        loyalCustomer1.addPurchase(200);
        System.out.println(loyalCustomer1.getName() + "has total expenditure: " +  + loyalCustomer1.totalExpenditure());
    }
}