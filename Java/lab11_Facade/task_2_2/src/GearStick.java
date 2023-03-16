/**
 * Коробка перемикання трансмісії
 */
public class GearStick {

  private int gear = 0;

  /**
   * Увімкнути передачу
   * @param gear - передача, яку необхідно увімкнути
   */
  public void changeGear(int gear) {
    if (gear == this.gear){
      return;
    }

    System.out.println("Changing gear to " + gear);
    this.gear = gear;
  }

  /**
   * Повертає активну передачу
   * @return активна передача
   */
  public int getGear() {
    return gear;
  }
}
