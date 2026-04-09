import java.sql.SQLOutput;
import java.util.Scanner;

public class IfStatements {


  static void main() {

    Scanner sc = new Scanner(System.in);

    int x;
    int y;
    String operator;

    do {
      System.out.println("Enter operator: ");
      operator = sc.nextLine();
      System.out.print("Enter first number: ");
      x = sc.nextInt();
      System.out.print("Enter last number: ");
      y = sc.nextInt();


      switch (operator) {
        case "+":
          System.out.println(x + y);
          break;
          case "-":
            System.out.println(x - y);
            break;
            case "*":
              System.out.println(x * y);
              break;
              case "/":
                System.out.println(x / y);
                break;
                default:
                  System.out.println("Invalid operator");
      }

    } while (true);
  }
}
