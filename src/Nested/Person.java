package Nested;

public class Person {
static String person1 = "Jhon";
private static String person2 = "Frank";
public String person3 = "Andy";

//Static Nested Class
  static class StaticPerson{
    void show(){
        System.out.println("I am static"+ person1);
      System.out.println("I am static"+ person2);

    }
}

}
