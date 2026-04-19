package Section11;

public class BankAccount {
private double balance;

  public BankAccount(double balance) {
    this.balance = balance;
  }

  public void deposit(double amount) {
    this.balance += amount;
  }
  public void withdraw(double amount) {
    if (this.balance >= amount) {
      throw new InsufficientFundExecption("Insufficient funds. Available balance: " + this.balance);
    }
    this.balance -= amount;
  }

  public double getBalance() {
    return balance;
  }
}
