public class Truck implements Vehicle {
    @Override
    public String runTask() {
        return "Transferred cargo";
    }

    @Override
    public String getType() {
        return "Truck";
    }
}
