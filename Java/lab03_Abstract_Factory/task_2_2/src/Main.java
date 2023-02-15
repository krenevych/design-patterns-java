import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Tram> trams = new ArrayList<>();
        ArrayList<Trolleybus> trolleybuses = new ArrayList<>();

        final int A = 10;       // закупити A автобусів
        final int T = 5;        // закупити T трамваїв
        final int Tr = 40;      // закупити Tr – тролейбусів
        final int N = 200_000;  // орієнтований пробіг експлуатації

        for (int i = 0; i < A; i++) {
            Bus bus = new Bus(4500000, 25);
            buses.add(bus);
        }

        for (int i = 0; i < T; i++) {
            Tram tram = new Tram(9_000_000, 8);
            trams.add(tram);
        }

        for (int i = 0; i < Tr; i++) {
            Trolleybus trolley = new Trolleybus(6_800_000, 13);
            trolleybuses.add(trolley);
        }

        int finalCostContract = 0;
        for (Bus bus : buses) {
            finalCostContract += bus.getCost() + bus.getUsageCost() * N;
        }

        for (Tram tram : trams) {
            finalCostContract += tram.getCost() + tram.getUsageCost() * N;
        }

        for (Trolleybus trolleybus : trolleybuses) {
            finalCostContract += trolleybus.getCost() + trolleybus.getUsageCost() * N;
        }

        System.out.println(finalCostContract);
    }
}
