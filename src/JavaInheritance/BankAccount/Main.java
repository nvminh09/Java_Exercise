package JavaInheritance.BankAccount;
public class Main {
    public static void main(String[] args) {
        // Create a Bank Account object (A/c No. BA12345) with initial balance of $500.
        System.out.println("Create a Bank Account object (A/c No. BA1234) with initial balance of $500:");
        BankAccount accBA12345 = new BankAccount("BA12345", 500);
        System.out.println("Deposit $1000 into account BA12345.");
        accBA12345.deposit(1000);
        System.out.println("New balance after depositing $1000: " + accBA12345.getBalance());
        System.out.println("Withdraw $500 from the account BA12345.");
        accBA12345.withdraw(600);
        System.out.println("New balance after withdrawing $600: " + accBA12345.getBalance());
        // Create a Saving Account object (A/c No. SA1234) with initial balance of $450:
        System.out.println("Create a Bank Account object (A/c No. SA1234) with initial balance of $450:");
        SavingAccount accSA1234 = new SavingAccount("SA1234", 450);
        System.out.println("Withdraw $300 from the account SA1234.");
        accSA1234.withdraw(300);
        System.out.println("New balance after withdrawing $300: " + accSA1234.getBalance());
        // Create a Saving Account object (A/c No. SA1000) with initial balance of $300:
        System.out.println("Create a Bank Account object (A/c No. SA1000) with initial balance of $300:");
        SavingAccount accSA1000 = new SavingAccount("SA1000", 300);
        System.out.println("Withdraw $250 from the account SA1000.");
        accSA1000.withdraw(250);
        System.out.println("New balance after withdrawing $300: " + accSA1000.getBalance());
    }
}
