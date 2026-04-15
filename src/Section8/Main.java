package Section8;

public class Main {

  static void main() {
    Dog d = new Dog();
    Bird b = new Bird();

    d.bark();
    d.eat("Dogs");
    d.breath("Dogs");

    b.fly();
    b.breath("Birds");
  }
}
