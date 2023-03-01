
public class WeatherWarnings {

    private final double minTemperature;
    private final double maxTemperature;

    public WeatherWarnings(double minTemperature, double maxTemperature) {
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    public void postWarning(City city) {
        if (city.getTemperature() >= maxTemperature || city.getTemperature() <= minTemperature) {
            System.out.println("Warning! Current temperature in " + city.getName()
                    + " is " + city.getTemperature() + " " + city.getTemperatureScale());
            city.setHasWeatherWarning(true);
        } else {
            System.out.println("Temperature in " + city.getName() + " is OK.");
        }
    }

}
