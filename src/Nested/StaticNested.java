package Nested;

public class StaticNested {

  static void main() {
    Person person1 = new Person();
    Person.StaticPerson person2 = new Person.StaticPerson();
    person2.show();
  }

}
