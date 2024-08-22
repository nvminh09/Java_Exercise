package Interface.Bank;
class SavingAccount implements Account {
    private double balance;
    private double interestRate;
    public SavingAccount(double initialDeposit, double interestRate) {
        this.balance = initialDeposit;
        this.interestRate = interestRate;
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
    }
    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
    @Override
    public double getBalance() {
        return balance;
    }
    public void applyInterest() {
        balance += balance * interestRate / 100;
    }
}