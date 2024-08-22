// Write a Java program to create a class called "BankAccount" with attributes for account number, account holder's
// name, and balance. Include methods for depositing and withdrawing money, as well as checking the balance. Create a
// subclass called "SavingsAccount" that adds an interest rate attribute and a method to apply interest.
package OOP.BankAccount;
public class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " New balance: " + balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " New balance: " + balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }
    public double checkBalance() {
        return balance;
    }
}