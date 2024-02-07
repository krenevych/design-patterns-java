public class Truck implements Transport{
    final private float costTonnPerKm;

    public Truck(float costTonnPerKm) {
        this.costTonnPerKm = costTonnPerKm;
    }

    @Override
    public float delivery(int distance, int cargo){
        System.out.println("Delivery by road");
        return distance * cargo * costTonnPerKm;
    }


}
