public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(105, 140, Engine.Fuel.Petrol, 1.4f);
        Wheel wheel = new Wheel(Wheel.Material.Steel, 14);
        Car car = new Car(Car.Type.Sedan, Car.CarColor.White, engine, wheel);

        System.out.println(car);
    }
}
