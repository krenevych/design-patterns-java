public class WeatherWarningsAdapter extends WeatherWarnings {
    public WeatherWarningsAdapter(double minTemperature, double maxTemperature) {
        super(minTemperature, maxTemperature);
    }

    @Override
    public void postWarning(City city) {
        if (city.getTemperatureScale().equals("Celsius")) {
            double c = city.getTemperature();
            double f = (c * 1.8) + 32.0; // Convert to Fahrenheit
            City city1 = new NorthAmericanCity(city.getName(), f); // Fake city
            super.postWarning(city1);
            city.setHasWeatherWarning(city1.getHasWeatherWarning());
        }
        else if (city.getTemperatureScale().equals("Fahrenheit")) {
            super.postWarning(city);
        } else {
            throw new IllegalArgumentException("TemperatureScale is undefined");
        }

    }
}
