package Section7;

public class Person {
  private String name;
  private double weight;
  private int age;
  private enum Belt { WHITE, BLUE, PURPLE,BROWN, BLACK};


  public Person(String name, double weight, int age) {
    this.name = name;
    this.weight = weight;
    this.age = age;

  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void wakeUp() {
    System.out.println("Waking up");
  }
  public void eat() {
    System.out.println("Eating");
  }
  public void sleep() {
    System.out.println("Sleeping");
  }
  public void newStudent() {
    Belt belt = Belt.WHITE;
    System.out.println("The new student is " + getName()+" they are  " + getAge()+" years old "+ "they weight is " + getWeight()+" they are " + belt);

  }

}
