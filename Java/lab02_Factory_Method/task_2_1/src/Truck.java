public class Truck {
    final private float costTonnPerKm;

    public Truck(float costTonnPerKm) {
        this.costTonnPerKm = costTonnPerKm;
    }

    public float deliverByRoad(int distance, int cargo){
        System.out.println("Delivery by road");
        return distance * cargo * costTonnPerKm;
    }


}
