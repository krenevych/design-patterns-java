public class LogisticsRoad extends Logistics {
    @Override
    protected Transport createTransport(float deliveryTariff) {
        return new Truck(deliveryTariff);
    }
}
