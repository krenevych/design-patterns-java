import java.util.ArrayList;

public class AutoPark {

    private final ArrayList<Mazda> autos = new ArrayList<>();

    public void createAutoPark(int n){
        for (int i = 0; i < n; ++i){
            Mazda car = new Mazda();
            autos.add(car);
        }
    }

    public void run(){
        for (Mazda car : autos) {
            car.run();
        }
    }

}
