package Section8;

public class Motorcycle implements Drivable {
  @Override
  public void turnLeft() {
    System.out.println("Motorcycle turn left");
  }
  @Override
  public void turnRight() {
    System.out.println("Motorcycle Turn Right");
  }

}
