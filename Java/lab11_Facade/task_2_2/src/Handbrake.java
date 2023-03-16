/**
 * Ручні гальма
 */
public class Handbrake {

  private boolean isUp = true;

  /**
   * Відпустити ручне гальмо
   */
  public void pushDown() {
    if (!isUp) {
      return;
    }

    System.out.println("Pushing down handbrake");
    isUp = false;
  }

  /**
   * Увімкнути ручне гальмо
   */
  public void liftUp() {
    if (isUp) {
      return;
    }

    System.out.println("Lifting up handbrake");
    isUp = true;
  }


}
