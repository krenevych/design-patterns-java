import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        // Спостережна станція
//        WeatherWarnings weatherWarnings = new WeatherWarnings(16, 100); // допустима температура визначається в межах
        WeatherWarnings weatherWarnings = new WeatherWarningsAdapter(16, 100); // допустима температура визначається в межах
        //                                                                     // від 16 до 100 градусів по Фаренгейту
        //                                                                     // тобто від -8.89 до 37.78 градусів по Цельсію

        City[] cityArray = {
                new NorthAmericanCity("Chicago", 16),  // 16 градусів по Фаренгейту
                new NorthAmericanCity("Phoenix", 104), // 104 градуси по Фаренгейту
                new NorthAmericanCity("Portland", 70), // 70 градусів по Фаренгейту
                new AsianCity("Bangkok", 50), // 50 градусів по Цельсію це 122 градуси по Фаренгейту
                new AsianCity("Beijing", 7)   // 7 градусів по Цельсію це 44.89 градусів по Фаренгейту
        };

        for (City city : cityArray) {
            weatherWarnings.postWarning(city);
        }


        System.out.println("============ Result ====================");
        for (City city : cityArray) {
            if (city.getHasWeatherWarning()){
                System.out.printf("%s has temperature warning! Temperature is %s %s\n",
                        city.getName(), city.getTemperature(), city.getTemperatureScale());
            }
        }

    }

}
