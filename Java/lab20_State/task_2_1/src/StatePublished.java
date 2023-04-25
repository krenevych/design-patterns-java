public class StatePublished implements State {
    @Override
    public void publish(Document document, String user) {
       System.out.println("StatePublished: state has not been changed!");

    }

    @Override
    public void abandon(Document document, String user) {
        System.out.println("StatePublished -> StateDraft");
        document.setState(new StateDraft());
    }
}
