public class Ship implements Transport {

    public Ship(float deliveryTariff) {
        this.deliveryTariff = deliveryTariff;
    }

    final private float deliveryTariff;

    @Override
    public float deliver(int distance, int cargo) {
        System.out.println("Delivery by see");
        return distance * cargo * deliveryTariff;
    }
}
