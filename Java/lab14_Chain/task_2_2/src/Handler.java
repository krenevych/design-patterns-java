public interface Handler {
    void setNext(Handler handler);
    void applyProperty(Image image);
}
