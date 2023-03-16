public class Car {

  public static void main(String[] args) {
    CarFacade car  = new CarFacade();
    car.turnOn();
    car.raiseGear();
    car.raiseGear();
    car.raiseGear();
    car.lowerGear();
    car.lowerGear();
    car.lowerGear();
    car.turnOff();
  }

}
