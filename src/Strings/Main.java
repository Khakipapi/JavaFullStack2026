package Strings;

public class Main {

  static void main() {
    //String Literal
    String name = "Jose";
    String surname = "Reyes";

    System.out.println(name);
    System.out.println(surname);

    //String object
    String stringObj = new String("Jose");
    System.out.println(stringObj);
    System.out.println(stringObj.equals(name));
    System.out.println(stringObj.equals(surname));
  }

}
