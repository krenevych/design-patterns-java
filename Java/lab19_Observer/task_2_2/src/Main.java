public class Main {

    public static void main(String[] args) {
        WeatherDataCenter dataCenter = new WeatherDataCenter();

        TemperatureAlarmService temperatureAlarmService = new TemperatureAlarmService();
        dataCenter.subscribe(temperatureAlarmService);

        HumidityAlarmService humidityAlarmService = new HumidityAlarmService();
        PressureAlarmService pressureAlarmService = new PressureAlarmService();
        dataCenter.subscribe(humidityAlarmService);
        dataCenter.subscribe(pressureAlarmService);


        while (true) {    // main loop
            if (dataCenter.update())
                break;
        }

        System.out.println("Finish of the simulation.");
    }

}
