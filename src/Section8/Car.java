package Section8;

public class Car extends Vehicle implements Drivable {

  public Car(String type, String model) {
    super(type, model);
  }

  @Override
  public void turnLeft() {
    System.out.println("Motorcycle turn left");
  }
  @Override
  public void turnRight() {
    System.out.println("Motorcycle turn right");
  }

}
