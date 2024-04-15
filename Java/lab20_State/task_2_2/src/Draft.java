public class Draft implements State {
    @Override
    public void publish(String user, Document document) {
        if ("admin".equals(user)){
            State newState = new Published();
            document.setState(newState);
            System.out.println("Draft -> Published");
        } else {
            State newState = new UnderModeration();
            document.setState(newState);
            System.out.println("Draft -> UnderModeration");
        }
    }

    @Override
    public void abandon(String user, Document document) { }
}
