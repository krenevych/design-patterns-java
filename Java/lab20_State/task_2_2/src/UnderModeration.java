public class UnderModeration implements State {
    @Override
    public void publish(String user, Document document) {
        if ("moderator".equals(user) || "admin".equals(user)){
            State newState = new Published();
            document.setState(newState);
            System.out.println("UnderModeration -> Published");
        } else {
            System.out.println("!!! Prohibired: UnderModeration -> Published");

        }
    }

    @Override
    public void abandon(String user, Document document) {
        State newState = new Draft();
        document.setState(newState);
        System.out.println("UnderModeration -> Draft");
    }
}
