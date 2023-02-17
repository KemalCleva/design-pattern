package it.euris.factory;

import it.euris.factory.Vehicle.VehicleEnum;

public class BuildVehicle {

  public SpeedInterface getVehicle(VehicleEnum vehicle) {

    switch (vehicle) {
      case CAR: return new Car(12);
      case TRAIN: return new Train(23);
//      case PLANE: return new Plane(200);
      default: throw new RuntimeException("Vehicle not recognised");
    }
  }

}
