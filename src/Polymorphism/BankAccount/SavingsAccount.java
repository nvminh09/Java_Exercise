package Polymorphism.BankAccount;
class SavingsAccount extends BankAccount {
    private double withdrawLimit;
    public SavingsAccount(double initialBalance, double withdrawLimit) {
        super(initialBalance);
        this.withdrawLimit = withdrawLimit;
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= withdrawLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal limit exceeded.");
        }
    }
}