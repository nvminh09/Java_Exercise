package OOP.BankAccount;
public class SavingAccount extends BankAccount {
    private double savingRate;
    public SavingAccount(int accountNumber, String holderName, double balance, double savingRate) {
        super(accountNumber, holderName, balance);
        this.savingRate = savingRate;
    }
    public double getSavingRate() {
        return savingRate;
    }
    public void setSavingRate(double savingRate) {
        if (savingRate > 0) {
            this.savingRate = savingRate;
        } else {
            System.out.println("Saving rate must be positive.");
        }
    }
    public void applySavingRate() {
        double interest = getBalance() * savingRate / 100;
        deposit(interest);
        System.out.println("Interest applied: " + interest + ". New balance: " + checkBalance());
    }
}