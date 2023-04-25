public interface State {
    void publish(Document document, String user);
    void abandon(Document document, String user);
}
