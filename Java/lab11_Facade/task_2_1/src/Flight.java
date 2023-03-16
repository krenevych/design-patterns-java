import java.time.LocalDate;

/**
 * Допомагає здійснити бронювання квитків для перельоту
 */
public class Flight {

  /**
   * Забронювати квиток для вильоту
   * @param start дата вильоту
   */
  public void bookOutwardJourney(LocalDate start) {
    System.out.println("Outbound flight booked for " + start);
  }

    /**
   * Забронювати квиток для повернення
   * @param end дата повернення
   */
  public void bookReturnJourney(LocalDate end) {
    System.out.println("Return flight booked for " + end);
  }

}
