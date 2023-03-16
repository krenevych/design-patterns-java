import java.time.LocalDate;

/**
 * Клас для бронювання номера в готелі
 */
public class Hotel {

  /**
   * Здійснити бронювання готелю у вказані терміни
   * @param checkinDate дата заселення
   * @param checkoutDate дата виселення
   */
  public void book(LocalDate checkinDate, LocalDate checkoutDate) {
    System.out.println("Booking hotel for " + checkinDate + " to " + checkoutDate);
  }

}
