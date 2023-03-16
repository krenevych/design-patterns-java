/**
 * Клас Запалювання
 */
public class Ignition {

  private boolean isOn = false;

  /**
   * Завести автомобіль
   */
  public void turnOn() {
    if (isOn) {
      return;
    }

    System.out.println("Turning ignition on");
    isOn = true;
  }

    /**
   * Заглушити автомобіль
   */
  public void turnOff() {
    if (!isOn) {
      return;
    }

    System.out.println("Turning ignition off");
    isOn = false;
  }

}
