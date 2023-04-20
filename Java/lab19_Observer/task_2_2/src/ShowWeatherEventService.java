public class ShowWeatherEventService implements Subscriber {
    @Override
    public void onWeatherEvent(WeatherEvent event) {

        System.out.println("Update data: city: " + event.getLocation()
                + ", temperature = " + event.getTemperature()
                + ", humidity = " + event.getHumidity()
                + ", pressure = " + event.getPressure());
    }
}
