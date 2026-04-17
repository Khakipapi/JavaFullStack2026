package Section11;

public class ThrowsEx {

  static void main() {
    divide();
  }
  public static void divide() throws ArithmeticException,NumberFormatException {
    int a = Integer.parseInt("8b");
    int b = Integer.parseInt("0");
    int c = a/b;
    System.out.println("Result: " + c);
  }
}
