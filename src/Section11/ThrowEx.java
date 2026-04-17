package Section11;

public class ThrowEx {

  static void main(String[] args) {
    System.out.println(divide(5,0));
  }

  public static double divide(double a, double b) {
    if(b == 0) {
      throw new ArithmeticException("Division by zero");
    }
    return a / b;
  }

}
