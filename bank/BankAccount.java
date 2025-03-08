// BankAccount.java (Inside bank package)
package bank;
public class BankAccount {
    protected double balance; // Protected: Only accessible within the same package or subclasses
    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }
    // Public method: Accessible everywhere
    public void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }
    // Protected method: Accessible within the same package or subclasses
    protected void deductBalance(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount deducted: $" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
