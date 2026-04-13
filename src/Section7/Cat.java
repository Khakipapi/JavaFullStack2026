package Section7;

public class Cat extends Mamal {


  static void main() {
    Cat cat = new Cat();
    cat.publicMethod();
    cat.defaultMethod();
    cat.privateMethod();
    cat.protectedMethod();

  }

  private  void privateMethod() {
    System.out.println("this is a private cat");
  }
  void defaultMethod() {
    System.out.println("this is a default cat");
  }
  protected   void protectedMethod() {
    System.out.println("this is a protected cat");
  }
  public void publicMethod() {
    System.out.println("this is a public cat");
  }
}
