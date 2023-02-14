abstract public class Logistics {

    protected float deliveryTariff;  // Тариф на доставку вантажів

    public Logistics() {
    }

    public void setDeliveryTariff(float deliveryTariff) {
        this.deliveryTariff = deliveryTariff;
    }

    abstract Transport createTransport();

    public void planDelivery(int distance, int cargo) {
        Transport transport = createTransport();
        float totalCost = transport.deliver(distance, cargo);
        System.out.println("Delivery cost is " + totalCost);
    }
}
