import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Client {

    static Random random = new Random();


    public static void main(String[] args) {
        Handler handlerCamera = new PropertyHandlerCamera("Samsung Galaxy S23 Ultra");
        Handler handlerDateTime = new PropertyHandlerDateTime();
        Handler handlerType = new PropertyHandlerType(Image.Type.jpg);
        Handler handlerName = new PropertyHandlerName();

        handlerCamera.setNext(handlerDateTime);
        handlerDateTime.setNext(handlerType);
        handlerType.setNext(handlerName);


        for (int i = 0; i <= 10; ++i) {
            Image image = new Image();

            handlerCamera.applyProperty(image);

            try {
                Thread.sleep(1000 + random.nextInt(1500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Image created + " + image);
        }
    }
}
