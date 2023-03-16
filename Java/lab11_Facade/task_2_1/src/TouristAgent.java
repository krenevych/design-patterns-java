import java.time.LocalDate;

/**
 * Туристичний агент - Фасад для організації відпустки
 */
public class TouristAgent {

    /**
     * Організувати відпустку в зазначені тепміни
     * @param startDate початкова дата відпустки
     * @param endDate кінцева дата відпустки
     */
    public void organizeTour(LocalDate startDate, LocalDate endDate) {

        Flight flight = new Flight();
        flight.bookOutwardJourney(startDate);
        flight.bookReturnJourney(endDate);

        Hotel hotel = new Hotel();
        hotel.book(startDate, endDate);

        CarRental carRental = new CarRental();
        carRental.book(startDate, endDate);

    }

}
