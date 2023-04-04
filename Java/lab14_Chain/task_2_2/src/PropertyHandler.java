public class PropertyHandler implements Handler {

    private Handler next = null;
    @Override
    final public void setNext(Handler handler) {
        next = handler;
    }

    @Override
    public void applyProperty(Image image) {
        if (next != null){
            next.applyProperty(image);
        }
    }
}
