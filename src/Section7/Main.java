package Section7;

import java.util.Scanner;

public class Main {

  static void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of the student you want to add: ");
    String name = sc.nextLine();
    System.out.println("Enter the age of the student you want to add: ");
    int age = sc.nextInt();
    System.out.println("Enter the weight of the student you want to add: ");
    double weight = sc.nextDouble();
    Person person = new Person(name,weight,age);
    person.newStudent();
    
  }

}
