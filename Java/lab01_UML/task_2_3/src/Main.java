public class Main {
    public static void main(String[] args) {
        Car car = new Car("Porche 911");

        Wheel wheel = new Wheel(17);
        car.setWheel(wheel);

        float distance = car.go(10);
        System.out.printf("distance: %skm%n", distance);
    }
}
