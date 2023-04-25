public class StateModeration implements State {
    @Override
    public void publish(Document document, String user) {
        System.out.println("StateModeration -> StatePublished");
        document.setState(new StatePublished());
    }

    @Override
    public void abandon(Document document, String user) {
        System.out.println("StateModeration -> StateDraft");
        document.setState(new StateDraft());
    }
}
