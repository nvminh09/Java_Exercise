// Static Members in Different Contexts
// Write a Java program to create a class called "BankAccount" with instance variables 'accountNumber' and balance, and static variables
// 'bankName' and 'interestRate'. Provide static methods to get and set the static variables. Create several 'BankAccount' objects and
// print their details along with the static variables.
package StaticMember;
public class BankAccount {
    private int accountNumber;
    private double balance;
    private static String bankName;
    private static double interestRate;
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public static String getBankName() {
        return bankName;
    }
    public static void setBankName(String name) {
        bankName = name;
    }
    public static double getInterestRate() {
        return interestRate;
    }
    public static void setInterestRate(double rate) {
        interestRate = rate;
    }
    public void printDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate);
    }
    public static void main(String[] args) {
        BankAccount.setBankName("Bank of America");
        BankAccount.setInterestRate(0.05);
        BankAccount b1 = new BankAccount(1001, 5000);
        BankAccount b2 = new BankAccount(1002, 10000);
        BankAccount b3 = new BankAccount(1003, 15000);
        b1.printDetails();
        b2.printDetails();
        b3.printDetails();
    }
}
