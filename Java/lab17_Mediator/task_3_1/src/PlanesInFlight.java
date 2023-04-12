import java.util.ArrayList;

/**
 * Літаки у повітрі
 */
public class PlanesInFlight {

  /**
   * Список літаків
   */
  ArrayList<Plane> planes = new ArrayList<>();

  /**
   * Додати літак
   * @param plane літак
   */
  public void addPlane(Plane plane) {
    planes.add(plane);
  }

  /**
   * Видалити літак зі списку
   * @param plane літак
   */
  public void removePlane(Plane plane) {
    planes.remove(plane);
  }

}
