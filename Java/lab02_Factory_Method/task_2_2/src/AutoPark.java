import java.util.ArrayList;

public class AutoPark {

    private final ArrayList<Car> autos = new ArrayList<>();

    public void createAutoPark(int n, CarFactory factory){
        for (int i = 0; i < n; ++i){
            Car car = factory.createCar();
            autos.add(car);
        }
    }

    public void run(){
        for (Car car : autos) {
            car.run();
        }
    }

}
