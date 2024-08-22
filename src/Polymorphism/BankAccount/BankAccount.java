// Write a Java program to create a base class BankAccount with methods deposit() and withdraw(). Create two
// subclasses SavingsAccount and CheckingAccount. Override the withdraw() method in each subclass to impose different
// withdrawal limits and fees.
package Polymorphism.BankAccount;
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}