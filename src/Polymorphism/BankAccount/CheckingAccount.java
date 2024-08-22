package Polymorphism.BankAccount;
class CheckingAccount extends BankAccount {
    private double overdraftFree;
    public CheckingAccount(double initialBalance, double overdraftFree) {
        super(initialBalance);
        this.overdraftFree = overdraftFree;
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Overdraft free applied.");
            super.withdraw(amount + overdraftFree);
        }
    }
}