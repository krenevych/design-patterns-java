public class Ship implements Transport {
    private final float costTonn;
    public Ship(float costTonn) {
        this.costTonn = costTonn;
    }

    @Override
    public float delivery(int distance, int cargo) {
        System.out.println("Delivery by sea");
        return  cargo * costTonn;
    }
}
