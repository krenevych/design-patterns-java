abstract public class City {

    private final String name;
    private final double temperature;
    private boolean hasWeatherWarning;

    public City(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
        hasWeatherWarning = false;
    }

    public String getName() {
        return name;
    }

    public double getTemperature() {
        return temperature;
    }

    abstract public String getTemperatureScale();

    public boolean getHasWeatherWarning() {
        return hasWeatherWarning;
    }

    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        this.hasWeatherWarning = hasWeatherWarning;
    }

}
