public class Truck implements Transport {
    final private float deliveryTariff;

    public Truck(float deliveryTariff) {
        this.deliveryTariff = deliveryTariff;
    }

    @Override
    public float deliver(int distance, int cargo){
        System.out.println("Delivery by road");
        return distance * cargo * deliveryTariff;
    }


}
