public class TemperatureAlarmService implements Subscriber {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        float temperature = event.getTemperature();
        if (temperature <= -20 || temperature >= 38){
            System.out.printf("У місті %s температура виходить за допустимі межі %s\n",
                    event.getLocation(), temperature);
        }
    }
}
