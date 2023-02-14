public class AirLogistics extends Logistics {
    @Override
    Transport createTransport() {
        return new Airplane(deliveryTariff);
    }
}
