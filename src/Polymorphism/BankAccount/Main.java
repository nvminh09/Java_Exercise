package Polymorphism.BankAccount;
public class Main {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount(2000, 650);
        BankAccount checkingAccount = new CheckingAccount(1000, 100);
        withdrawFromAccount(savingsAccount, 300);
        withdrawFromAccount(checkingAccount, 250);
        System.out.println("Saving account balance: " + savingsAccount.getBalance());
        System.out.println("Checking account balance: " + checkingAccount.getBalance());
    }
    public static void withdrawFromAccount(BankAccount account, double amount) {
        account.withdraw(amount);
    }
}