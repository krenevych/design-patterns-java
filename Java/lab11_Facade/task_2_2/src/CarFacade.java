public class CarFacade {

  public void turnOn() {
    ignition.turnOn();
  }
  public void turnOff() {
    ignition.turnOff();
  }

  // підвищити передачу
  public void raiseGear() {
    if (currentGear == 0) {
      handbrake.pushDown();
    }

    clutch.press();
    gearStick.changeGear(++currentGear);
    accelerator.press();
    clutch.lift();
  }

  private int currentGear = 0; // 0 - нейтральна передача
  // Понизити передачу
  public void lowerGear() {
    clutch.press();
    gearStick.changeGear(--currentGear);
    accelerator.press();
    clutch.lift();

    if (currentGear == 0) {
      handbrake.liftUp();
    }
  }

  private final Ignition ignition = new Ignition();
  private final Clutch clutch = new Clutch();
  private final Accelerator accelerator = new Accelerator();
  private final GearStick gearStick = new GearStick();
  private final Handbrake handbrake = new Handbrake();

}
