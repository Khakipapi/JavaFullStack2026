import java.util.Scanner;

public class Screamer {

  static void main() {
    Screamer s = new Screamer();
    Scanner input = new Scanner(System.in);
    int choice;
    do {
      s.menu();
      System.out.println("Enter your choice: ");
      choice = input.nextInt();
      System.out.println("Enter first number: ");
      double x = input.nextDouble();
      System.out.println("Enter second number: ");
      double y = input.nextDouble();
      switch (choice) {
        case 1:
          System.out.println("Result: " + add(x, y));
          break;
          case 2:
            System.out.println("Result: " + sub(x, y));
            break;
            case 3:
              System.out.println("Result: " + mul(x, y));
              break;
              case 4:
              System.out.println("Result: " + div(x, y));
              break;
              case 5:
                System.out.println("Exiting...");
                break;
                default:
                  System.out.println("Invalid choice.");
                  break;



      }
      ;
      ;
    } while (choice != 5);
    input.close();
  }

  public  static double add(double x , double y){
    return x+y;
  }
  public  static double sub(double x , double y){
    return x-y;
  }
  public  static double mul(double x , double y){
    return x*y;
  }
  public  static double div(double x , double y){
    return x/y;
  }

  public void menu(){
    System.out.println("--------Welcome to the calculator app--------");
    System.out.println("1. Add");
    System.out.println("2. Subtract");
    System.out.println("3. Multiply");
    System.out.println("4. Divide");
    System.out.println("5. Exit");

  }
}
