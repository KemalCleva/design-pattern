package it.euris.factory;

public class Vehicle implements SpeedInterface {

  private final int speed;

  public Vehicle(int speed) {
    this.speed = speed;
  }

  public int getSpeed() {
    return this.speed;
  };

  public enum VehicleEnum {
    CAR,
    TRUCK,
    TRAIN,
    PLANE;
  }

}
