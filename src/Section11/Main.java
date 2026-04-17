package Section11;

import java.util.Scanner;

public class Main {

  static void main() {
    try {
      int number1 = 0, number2 = 0, result = 0;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter two numbers to add: ");
      number1 = input.nextInt();
      System.out.println("Enter second number: ");
      number2 = input.nextInt();
      System.out.println("Dividing " + number1 + " and " + number2);
      result = number1 / number2;
      System.out.println(result);
      input.close();
    } catch (ArithmeticException e) {
      System.out.println("You cannot divide by zero");
    } catch (Exception e) {
      System.out.println("An error occurred: " + e.getMessage());
    }
    finally {
      System.out.println("Good bye");
    }

  }
}
