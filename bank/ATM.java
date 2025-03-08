// ATM.java (Inside bank package - Main Class)
package bank;
public class ATM {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Create a bank account with $1000
        // Check balance
        account.showBalance();
        // Withdraw money
        account.deductBalance(500); // Deduct $500
        account.showBalance(); // Check updated balance
    }
}