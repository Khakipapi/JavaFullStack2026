package Section8;

import Section7.Animal;

public class Bird extends Animals implements CanFly, CanFeed {
  public void fly(){
    System.out.println("Flying...");
  }

  @Override
  public void canFly() {
    System.out.println("Can fly...");
  }

  @Override
  public void feed() {
    System.out.println("Feeding...");
  }
}
