public class Main {
    public static void main(String[] args) {

        Wheel wheel = new Wheel(17);

        Car car = new Car("Porsche 911", wheel);


        Wheel wheel2 = new Wheel(21);
        car.setWheel(wheel2);

        float distance = car.go(10);
        System.out.printf("distance: %skm%n", distance);
    }
}
