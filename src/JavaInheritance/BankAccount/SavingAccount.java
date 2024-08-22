package JavaInheritance.BankAccount;
public class SavingAccount extends BankAccount {
    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount > 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Minimum balance of $100 required.");
        }
    }
}