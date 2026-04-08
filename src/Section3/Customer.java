package Section3;

import java.util.Scanner;

public class Customer{
 String firstName;
 String lastName;

  public static void main (String[] args) {
   Customer customer = new Customer();
   customer.getFullName();
  }


  public void getFullName(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your first name:");
    firstName = input.nextLine();
    System.out.println("Enter your last name:");
    lastName = input.nextLine();
    System.out.print("Full name is: "+ (firstName+" "+lastName));
  }
}