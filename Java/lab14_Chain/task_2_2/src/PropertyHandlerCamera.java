public class PropertyHandlerCamera extends PropertyHandler {

    final private String cameraName;

    public PropertyHandlerCamera(String cameraName) {
        this.cameraName = cameraName;
    }

    @Override
    public void applyProperty(Image image) {
        image.setCamera(cameraName);
        super.applyProperty(image);
    }
}
