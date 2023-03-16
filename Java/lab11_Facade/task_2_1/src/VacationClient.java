import java.time.LocalDate;

public class VacationClient {

  public static void main(String[] args) {
    LocalDate startDate = LocalDate.of(2023, 8, 1);
    LocalDate endDate = LocalDate.of(2023, 8, 15);

    // Виклик фасаду - туристичного агента
    TouristAgent touristAgent = new TouristAgent();
    touristAgent.organizeTour(startDate, endDate);
  }

}
