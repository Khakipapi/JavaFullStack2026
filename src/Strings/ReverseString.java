package Strings;

import java.util.Scanner;

public class ReverseString {

  static void main() {
    Scanner sc = new Scanner(System.in);

    //make the prompt
    System.out.println("Enter a string:");
    String str = sc.nextLine();
    StringBuilder sb = new StringBuilder(str);
    sb.reverse();
    System.out.println(sb.toString());
  }

}
