import java.util.ArrayList;
import java.util.List;

public class WeatherDataCenter {

    final private WeatherReader weatherReader;

    public WeatherDataCenter() {
        weatherReader = new WeatherReader("resources/input01.txt");
    }

    public boolean update() {
        WeatherEvent weatherEvent = weatherReader.getEvent();
        if (weatherEvent == null){
            return false;
        }

        if (weatherEvent.getLocation().equals("end")){
            return true;
        }

//        System.out.println("Update data: city: " + weatherEvent.getLocation()
//                + ", temperature = " + weatherEvent.getTemperature()
//                + ", humidity = " + weatherEvent.getHumidity()
//                + ", pressure = " + weatherEvent.getPressure());

        notifySubscribers(weatherEvent);

        return false;
    }

    private final List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    private void notifySubscribers(WeatherEvent event) {
        for (Subscriber subscriber : subscribers) {
            subscriber.onWeatherEvent(event);
        }


    }
}
