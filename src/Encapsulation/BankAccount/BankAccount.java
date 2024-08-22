// Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance.
// Provide public getter and setter methods to access and modify these variables.
package Encapsulation.BankAccount;
public class BankAccount {
    private String accountNumber;
    private int balance;
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}