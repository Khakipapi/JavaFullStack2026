package Enums;

import java.util.Scanner;

public class Main {

  static void main() {

    Scanner in = new Scanner(System.in);
    System.out.println("Enter a correct color");
    String color = in.nextLine();
    switch (color.toUpperCase()) {
      case "RED":
        System.out.println("red");
        break;
        case "GREEN":
          System.out.println("green");
          break;
          case "YELLOW":
            System.out.println("yellow");
            break;
            case "PURPLE":
              System.out.println("purple");
              break;
              default:
                System.out.println("invalid color");


    }

  }

}
