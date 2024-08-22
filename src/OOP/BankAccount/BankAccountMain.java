package OOP.BankAccount;
public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123456, "John Doe", 1000);
        System.out.println("Account number: " + account1.getAccountNumber() + " Holder name: " + account1.getHolderName() +
                            " Balance: " + account1.getBalance());
        account1.deposit(500);
        System.out.println("Account number: " + account1.getAccountNumber() + " Holder name: " + account1.getHolderName() +
                            " Balance after deposit 500: " + account1.getBalance());
        account1.withdraw(200);
        System.out.println("Account number: " + account1.getAccountNumber() + " Holder name: " + account1.getHolderName() +
                            " Balance after withdraw 500: " + account1.getBalance());
        SavingAccount saveAcc1 = new SavingAccount(111111, "John Smith", 10000, 5);
        System.out.println("Saving Account number: " + saveAcc1.getAccountNumber() + " Holder name: " + saveAcc1.getHolderName() +
                            " Balance: " + saveAcc1.getBalance());
        saveAcc1.applySavingRate();
        System.out.println("Saving Account number: " + saveAcc1.getAccountNumber() + " Holder name: " + saveAcc1.getHolderName() +
                            " Balance after applying saving rate: " + saveAcc1.getBalance());
    }
}