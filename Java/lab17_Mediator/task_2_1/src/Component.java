public class Component {
    private Mediator mediator;
    public final String id;

    public Component(String id) {
        this.id = id;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sendMessage(String message, String to){
        if (mediator != null){
            mediator.receiveMessage(message, id, to);
        }
    }

    public void receiveMessage(String message, String from){
        System.out.printf("Компонент %s, отримав повідомлення '%s' від компонента %s\n", id, message, from);
    }
}
