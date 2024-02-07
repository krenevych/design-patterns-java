abstract public class Logistics {

    private float deliveryTariff;  // Тариф на доставку вантажів

    public Logistics() {
    }

    abstract protected Transport createTransport(float deliveryTariff);

    public void setDeliveryTariff(float deliveryTariff) {
        this.deliveryTariff = deliveryTariff;
    }

    public void planDelivery(int distance, int cargo) {
//        Truck truck = new Truck(deliveryTariff);
        Transport transport = createTransport(deliveryTariff);

        float totalCost = transport.delivery(distance, cargo);
        System.out.println("Delivery cost is " + totalCost);
    }
}
