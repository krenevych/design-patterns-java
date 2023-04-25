public class StateDraft implements State {
    @Override
    public void publish(Document document, String user) {
        if ("admin".equals(user)){
            System.out.println("StateDraft -> StatePublished");
            document.setState(new StatePublished());
        } else {
            System.out.println("StateDraft -> StateModeration");
            document.setState(new StateModeration());
        }
    }

    @Override
    public void abandon(Document document, String user) {
        System.out.println("StateDraft: state has not been changed!");
    }
}
