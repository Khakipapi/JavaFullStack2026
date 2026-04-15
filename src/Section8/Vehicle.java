package Section8;

public abstract class Vehicle {

  String type;
  String model;

  public Vehicle(String type, String model) {
    this.type = type;
    this.model = model;
  }

  public void start() {
    System.out.println("Starting Vehicle");
  }
  public void stop() {
    System.out.println("Stopping Vehicle");
  }
  public String getType() {
    return type;
  }
}
