package AbstractClass.BankAccount;
class SavingAccount extends BankAccount {
    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of " + amount + " successfully. Current balance is: " + getBalance());
    }
    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw of " + amount + " successfully. Current balance is: " + getBalance());
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}