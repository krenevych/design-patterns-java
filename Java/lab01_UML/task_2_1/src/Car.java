public class Car implements Vehicle {
    @Override
    public String runTask() {
        return "Car curring passengers";
    }

    @Override
    public String getType() {
        return "Car";
    }
}
