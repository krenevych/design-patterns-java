import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Client {

    static Random random = new Random();

    public static void main(String[] args) {

        for (int i = 0; i <= 10; ++i) {
            Image image = new Image();
            // Camera properties
            image.setCamera("Samsung Galaxy S23 Ultra");

            // Date/time properties
            String time = new SimpleDateFormat("HHmmss").format(new Date());
            image.setCreationTime(time);
            String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
            image.setCreationDate(date);

            // Type of image
            image.setType(Image.Type.jpg);

            // Name
            String creationDate = image.getCreationDate();
            String creationTime = image.getCreationTime();
            String type = image.getType().toString();
            String name = "IMG_" + creationDate + "_" + creationTime + "." + type;
            image.setName(name);

            try {
                Thread.sleep(1000 + random.nextInt(1500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Image created + " + image);
        }
    }
}
