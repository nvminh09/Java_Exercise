// Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw().
// Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and
// implement the respective methods to handle deposits and withdrawals for each account type.
package AbstractClass.BankAccount;
abstract class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    protected void setBalance(double balance) {
        this.balance = balance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}