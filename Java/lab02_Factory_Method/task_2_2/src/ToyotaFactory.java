public class ToyotaFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Toyota();
    }
}
