package AbstractClass.BankAccount;
public class Main {
    public static void main(String[] args) {
        double balance, deposit, withdraw;
        balance = 1000.00;
        SavingAccount savingsAccount = new SavingAccount("SA001", balance);
        System.out.println("Savings A/c: Initial Balace: $" + balance);
        deposit = 500.00;
        savingsAccount.deposit(deposit);
        withdraw = 250.00;
        savingsAccount.withdraw(withdraw);
        withdraw = 1600.00;
        System.out.println("\nTry to withdraw: $" + withdraw);
        savingsAccount.withdraw(withdraw);

        System.out.println("--------------------------------------------------------------");
        balance = 5000.00;
        CurrentAccount currentAccount = new CurrentAccount("CA001", balance);
        System.out.println("Current A/c: Initial Balance: $" + balance);
        deposit = 2500.00;
        currentAccount.deposit(1000.0);
        withdraw = 1250.00;
        currentAccount.withdraw(3000.0);
        withdraw = 6000.00;
        System.out.println("\nTry to withdraw: $" + withdraw);
        savingsAccount.withdraw(withdraw);
    }
}
