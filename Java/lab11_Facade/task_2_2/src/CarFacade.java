/**
 * Автомобіль з роботизованою трансмісією - Фасад для автомобіля з механічною коробкою передач
 */
public class CarFacade {

  private final Ignition ignition = new Ignition();
  private final Clutch clutch = new Clutch();
  private final Accelerator accelerator = new Accelerator();
  private final GearStick gearStick = new GearStick();
  private final Handbrake handbrake = new Handbrake();

  /**
   * Завести автомобіль - увімкнути запалювання
   */
  public void turnOn() {
    ignition.turnOn();
  }

  /**
   * Заглушити автомобіль
   */
  public void turnOff() {
    ignition.turnOff();
  }

  /**
   * Підвищити передачу
   */
  public void raiseGear() {
    int currentGear = gearStick.getGear();

    if (currentGear == 0) {
      handbrake.pushDown();
    }

    clutch.press();
    gearStick.changeGear(currentGear + 1);
    accelerator.press();
    clutch.lift();
  }

  /**
   * Понизити передачу
   */
  public void lowerGear() {
    clutch.press();
    gearStick.changeGear(gearStick.getGear() - 1);
    accelerator.press();
    clutch.lift();

    if (gearStick.getGear() == 0) {
      handbrake.liftUp();
    }
  }

}
