// Constructor with Validation
// Write a Java program to create a class called Account with instance variables accountNumber and balance. Implement a parameterized
// constructor that initializes these variables with validation:
// - accountNumber should be non-null and non-empty.
// - balance should be non-negative.
// - Print an error message if the validation fails.
package Constructor;
public class Account {
    private String accountNumber;
    private double balance;
    public Account(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("Account number cannot be null or empty.");
        } else if (balance < 0) {
            System.out.println("Balance cannot be negative.");
        } else {
            this.accountNumber = accountNumber;
            this.balance = balance;
            System.out.println("Account name: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }
    public static void main(String[] args) {
        Account account1 = new Account("123456", 1000);
        Account account2 = new Account("", 100);
        Account account3 = new Account(null,100);
        Account account4 = new Account("123",-100);
    }
}
