package OOP.Bank;

import java.util.ArrayList;

// Write a Java program to create a class called "Bank" with a collection of accounts
// and methods to add and remove accounts, and to deposit and withdraw money.
// Also define a class called "Account" to maintain account details of a particular customer.
public class BankAccount {
    private String name;
    private Integer accountNumber;
    private Integer balance;
    public BankAccount(String name, Integer accountNumber, Integer balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public Integer getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber() {
        this.accountNumber = accountNumber;
    }
    public Integer getBalance() {
        return balance;
    }
    public void setBalance() {
        this.balance = balance;
    }
    // Method to deposit
    public void deposit(Integer deposit) {
        if (deposit > 0) {
            this.balance += deposit;
        }
    }
    // Method to withdraw
    public void withdraw(Integer withdraw) {
        if (withdraw > 0 && withdraw < balance) {
            this.balance -= withdraw;
        }
    }
    // Get account information
    public String getAccountInformation() {
        return "Ten tai khoan: " + this.name + "\n So tai khoan: " + this.accountNumber + "\n So tien: " + this.balance;
    }
}