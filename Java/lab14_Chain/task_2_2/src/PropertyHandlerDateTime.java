import java.text.SimpleDateFormat;
import java.util.Date;

public class PropertyHandlerDateTime extends PropertyHandler {

    @Override
    public void applyProperty(Image image) {
        String time = new SimpleDateFormat("HHmmss").format(new Date());
        image.setCreationTime(time);
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
        image.setCreationDate(date);

        super.applyProperty(image);
    }
}
