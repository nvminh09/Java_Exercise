package OOP.Bank;

import java.util.ArrayList;

// Write a Java program to create a class called "Bank" with a collection of accounts
// and methods to add and remove accounts, and to deposit and withdraw money.
// Also define a class called "Account" to maintain account details of a particular customer.
public class Bank {
    private ArrayList<BankAccount> accounts;
    public Bank() {
        accounts = new ArrayList<BankAccount>();
    }
    // Method to add account
    public void addAccount(BankAccount accountBank) {
        accounts.add(accountBank);
    }
    // Method to remove account
    public void removeAccount(BankAccount accountBank) {
        accounts.remove(accountBank);
    }
    // Method to deposit money
    public void depositMoney(BankAccount acc, Integer depositMoney) {
        acc.deposit(depositMoney);
    }
    // Method to withdraw money
    public void withdrawMoney(BankAccount acc, Integer withdrawMoney) {
        acc.withdraw(withdrawMoney);
    }
    // Get the information of all accounts
    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }
}