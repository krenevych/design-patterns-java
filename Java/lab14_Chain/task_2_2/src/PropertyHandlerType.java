public class PropertyHandlerType extends PropertyHandler {

    final private Image.Type type;

    public PropertyHandlerType(Image.Type type) {
        this.type = type;
    }

    @Override
    public void applyProperty(Image image) {
        image.setType(type);

        super.applyProperty(image);
    }
}
