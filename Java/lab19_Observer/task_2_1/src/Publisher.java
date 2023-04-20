import java.util.ArrayList;
import java.util.List;

public class Publisher {

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private final String name;
    private String mainState = "";
    public void setMainState(String mainState) {
        if (mainState.equals(this.mainState)){
            return;
        }

        this.mainState = mainState;
        notifySubscribers(mainState);
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "name='" + name + '\'' +
                ", mainState='" + mainState + '\'' +
                '}';
    }

    private final List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    private void notifySubscribers(String context){
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this, context);
        }


    }

}
