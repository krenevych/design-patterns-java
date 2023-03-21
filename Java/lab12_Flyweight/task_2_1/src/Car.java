public class Car implements Vehicle {

  public Car() {
    System.out.println("Car is created");
  }

  public String getType() {
    return "Car";
  }


  @Override
  public String runTask(int latitude, int longitude) {
    return "Transportation of passengers to the destination: (" + latitude + ", " + longitude + ")";
  }


}
