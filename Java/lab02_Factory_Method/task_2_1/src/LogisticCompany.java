public class LogisticCompany {

    public static void main(String[] args) {
        Logistics logistic = new AirLogistics();
        logistic.setDeliveryTariff(2.0f);  // 0.5$ for 1 tonn of cargo per 1 km
        logistic.planDelivery(500, 20);
    }
}
