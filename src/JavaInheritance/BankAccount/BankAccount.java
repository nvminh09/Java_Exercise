// Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
// Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals
// if the account balance falls below one hundred.
package JavaInheritance.BankAccount;
public class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    public double getBalance() {
        return balance;
    }
}