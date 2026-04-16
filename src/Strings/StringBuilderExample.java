package Strings;

public class StringBuilderExample {

  static void main() {
    StringBuilder sb =  new StringBuilder("Hello");
    sb.append("World");
    System.out.println(sb.toString());

    System.out.println(sb.length());
    System.out.println(sb.insert(0, "World"));
    System.out.println(sb.delete(0, 2));
    System.out.println(sb.reverse());

  }

}
