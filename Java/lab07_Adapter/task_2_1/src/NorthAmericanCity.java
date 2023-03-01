public class NorthAmericanCity extends City {

    public NorthAmericanCity(String name, double temperature) {
        super(name, temperature);
    }

    public String getTemperatureScale() {
        return "Fahrenheit";
    }
}
