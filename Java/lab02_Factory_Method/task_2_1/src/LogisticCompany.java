public class LogisticCompany {

    public static void main(String[] args) {
        Logistics logistic = new Logistics();
        logistic.setDeliveryTariff(0.5f);  // 0.5$ for 1 tonn of cargo per 1 km
        logistic.planDelivery(500, 20);
    }
}
