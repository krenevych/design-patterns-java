import java.time.LocalDate;

/**
 * Клас оренди автомобіля
 */
public class CarRental {

  /**
   * Здійснити оренду автомобіля
   * @param start початкова дата оренди автомобіля
   * @param end кінцева дата оренди автомобіля
   */
  public void book(LocalDate start, LocalDate end) {
    System.out.println("Booking car for " + start + " to " + end);
  }

}
