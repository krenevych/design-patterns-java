public class Published implements State {
    @Override
    public void publish(String user, Document document) {
        System.out.println("Published");
    }

    @Override
    public void abandon(String user, Document document) {
        State newState = new Draft();
        document.setState(newState);
        System.out.println("Published -> Draft");
    }
}
