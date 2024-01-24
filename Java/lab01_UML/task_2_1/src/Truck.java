public class Truck implements Vehicle {

    @Override
    public String runTask() {
        return "Truck curring luggage";
    }

    @Override
    public String getType() {
        return "Truck";
    }
}
