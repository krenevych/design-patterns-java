public class Logistics {

    private float deliveryTariff;  // Тариф на доставку вантажів

    public Logistics() {
    }

    public void setDeliveryTariff(float deliveryTariff) {
        this.deliveryTariff = deliveryTariff;
    }

    public void planDelivery(int distance, int cargo) {
        Truck truck = new Truck(deliveryTariff);

        float totalCost = truck.deliverByRoad(distance, cargo);
        System.out.println("Delivery cost is " + totalCost);
    }
}
