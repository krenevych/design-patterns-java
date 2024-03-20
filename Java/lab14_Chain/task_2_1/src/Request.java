import java.util.Random;

abstract public class Request {

    public long getId() {
        return id;
    }

    private final long id;

    public Request() {
        Random random = new Random();
        id = random.nextInt();
    }
}
