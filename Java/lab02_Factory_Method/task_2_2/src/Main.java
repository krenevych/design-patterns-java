public class Main {

    public static void main(String[] args) {
        AutoPark autoPark = new AutoPark();
        autoPark.createAutoPark(5, new MazdaFactory());
        autoPark.createAutoPark(2, new ToyotaFactory());
        autoPark.run();
    }

}
