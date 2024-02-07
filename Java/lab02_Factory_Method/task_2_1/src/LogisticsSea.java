public class LogisticsSea extends Logistics {
    @Override
    protected Transport createTransport(float deliveryTariff) {
        return new Ship(deliveryTariff);
    }
}
