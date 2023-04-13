abstract public class Component {
    public void broadcastMessage(Order order) {
        if (mediator != null) {
            mediator.broadcast(this, order);
        }
    }

    public abstract void handleMessage(Component componentFrom, Order order);

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

}
