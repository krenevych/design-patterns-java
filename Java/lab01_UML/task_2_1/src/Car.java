public class Car implements Vehicle {
    @Override
    public String runTask() {
        return "Running 50 km";
    }

    @Override
    public String getType() {
        return "Car";
    }
}
