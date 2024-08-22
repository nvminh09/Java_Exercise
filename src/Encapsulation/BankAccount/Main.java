package Encapsulation.BankAccount;
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber("012345");
        bankAccount.setBalance(1000);
        String account = bankAccount.getAccountNumber();
        int balance = bankAccount.getBalance();
        System.out.println("Account: " + account);
        System.out.println("Balance: " + balance);
    }
}