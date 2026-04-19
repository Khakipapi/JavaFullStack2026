package Section11;

import java.util.Scanner;

public class Test {

  static void main() {
    BankAccount bankAccount = new BankAccount(1000);
    Scanner input = new Scanner(System.in);
    int choice;
    do {
      System.out.println("-------Bank Account Menu-------");
      menu();
      choice = input.nextInt();
      switch (choice) {
        case 1:
          System.out.println("Enter amount to deposit: ");
          double depositAmount = input.nextDouble();
          bankAccount.deposit(depositAmount);
          System.out.println("Deposit successful. Current balance: " + bankAccount.getBalance());
          break;
        case 2:
          System.out.println("Enter amount to withdraw: ");
          double withdrawAmount = input.nextDouble();
          try {
            bankAccount.withdraw(withdrawAmount);
            System.out.println("Withdrawal successful. Current balance: " + bankAccount.getBalance());
          } catch (InsufficientFundExecption e) {
            System.out.println(e.getMessage());
          }
          break;
        case 3:
          System.out.println("Current balance: " + bankAccount.getBalance());
          break;
        case 4:
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Invalid choice. Please try again.");
      }
    } while (choice !=4);
  }

  public static void menu() {
    System.out.println("1. Deposit");
    System.out.println("2. Withdraw");
    System.out.println("3. Check Balance");
    System.out.println("4. Exit");
    System.out.println("Enter your choice: ");
  }
}
