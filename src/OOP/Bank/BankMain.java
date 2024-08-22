package OOP.Bank;

import java.util.ArrayList;

// Write a Java program to create a class called "Bank" with a collection of accounts
// and methods to add and remove accounts, and to deposit and withdraw money.
// Also define a class called "Account" to maintain account details of a particular customer.
public class BankMain {
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount("Nguyen Van A", 11223301, 1000);
        BankAccount bank2 = new BankAccount("Nguyen Van B", 11223302, 2000);
        BankAccount bank3 = new BankAccount("Nguyen Van C", 11223303, 3000);
        Bank bank = new Bank();
        bank.addAccount(bank1);
        bank.addAccount(bank2);
        bank.addAccount(bank3);
        ArrayList<BankAccount> accounts = bank.getAccounts();
        for (BankAccount accountBank:accounts) {
            System.out.println(accountBank.getAccountInformation());
        }
        System.out.println("----------DIEU CHINH SO TIEN----------");
        System.out.println("\nSau khi them 100 vao tai khoan bank1:");
        bank.depositMoney(bank1, 100);
        System.out.println(bank1.getAccountInformation());
        System.out.println("\nSau khi tru 200 vao tai khoan bank2:");
        bank.withdrawMoney(bank2, 200);
        System.out.println(bank2.getAccountInformation());
        System.out.println("----------XOA TAI KHOAN bank3----------");
        bank.removeAccount(bank3);
        for (BankAccount accountBank:accounts) {
            System.out.println(accountBank.getAccountInformation());
        }
    }
}
