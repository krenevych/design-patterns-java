public class LogisticCompany {

    public static void main(String[] args) {
//        Logistics logistic = new LogisticsRoad();
        Logistics logistic = new LogisticsSea();
//        logistic.setDeliveryTariff(0.5f);  // 0.5$ for 1 tonn of cargo per 1 km
        logistic.setDeliveryTariff(50f);  // 50$ for 1 tonn of cargo
        logistic.planDelivery(500, 20);
    }
}
