public class Airplane implements Transport {

    public Airplane(float deliveryTariff) {
        this.deliveryTariff = deliveryTariff;
    }

    final private float deliveryTariff;

    @Override
    public float deliver(int distance, int cargo) {
        System.out.println("Delivery by air");
        return distance * cargo * deliveryTariff;
    }
}
