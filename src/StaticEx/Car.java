package StaticEx;

public class Car {

  public static int currentSpeed = 0;
  public static int maxSpeed = 0;

  public static void showCurrentSpeed() {
    System.out.println(currentSpeed);
  }

  public static void speedUp(int increase) {
    currentSpeed += increase;
    if (currentSpeed > maxSpeed) {
      maxSpeed = currentSpeed;
    } else {
      showCurrentSpeed();
    }
  }
}
