public class Car {


  public static void main(String[] args) {
    Ignition ignition = new Ignition();
    Clutch clutch = new Clutch();
    Accelerator accelerator = new Accelerator();
    GearStick gearStick = new GearStick();
    Handbrake handbrake = new Handbrake();

    ignition.turnOn();
    handbrake.pushDown();

    clutch.press();
    gearStick.changeGear(1);
    accelerator.press();
    clutch.lift();

    clutch.press();
    gearStick.changeGear(2);
    accelerator.press();
    clutch.lift();

    clutch.press();
    gearStick.changeGear(1);
    accelerator.press();
    clutch.lift();

    clutch.press();
    gearStick.changeGear(0);
    accelerator.press();
    clutch.lift();

    handbrake.liftUp();
    ignition.turnOff();
  }

}
