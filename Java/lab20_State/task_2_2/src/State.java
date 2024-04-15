public interface State {
    void publish(String user, Document document);
    void abandon(String user, Document document);
}
