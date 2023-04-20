public class HumidityAlarmService implements Subscriber {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        float humidity = event.getHumidity();
        if (humidity <= 50){
            System.out.printf("У місті %s вологість виходить за допустимі межі %s\n",
                    event.getLocation(),
                    humidity);
        }
    }
}
