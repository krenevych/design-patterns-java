/**
 * Злітно-посадкова смуга
 */
public class Runway {

  /**
   * Чи вільна смуга
   */
  private boolean isAvailable = true;

  /**
   * Встановити стан злітно-посадкової смуги
   * @param isAvailable значення для встановлення
   */
  public void setIsAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  /**
   * Повертає значення чи вільна злітно-посадкова смуга
   * @return чи вільна злітно-посадкова смуга
   */
  public boolean getIsAvailable() {
    return isAvailable;
  }

}
