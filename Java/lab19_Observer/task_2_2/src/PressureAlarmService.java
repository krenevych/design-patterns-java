public class PressureAlarmService implements Subscriber {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        float pressure = event.getPressure();
        if (pressure <= 720 || pressure >= 780){
            System.out.printf("У місті %s атмосферний тиск виходить за допустимі межі %s\n",
                    event.getLocation(),
                    pressure);
        }
    }
}
