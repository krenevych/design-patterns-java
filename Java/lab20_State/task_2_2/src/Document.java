public class Document {
//    Контекст = Document

    public Document() {
        state = new Draft();
    }

    public void publish(String user) {
        state.publish(user, this);
    }

    public void abandon(String user) {
        state.abandon(user, this);
    }

    private State state;  // спочатку документ під час створення знаходиться у стані чернетка
    void setState(State state){
        this.state = state;
    }

    // різні методи роботи з документом, що не
    // стосуються шаблону проектування Стан
    private String text = "";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Document{" +
                "state=" + state +
                ", text='" + text + '\'' +
                '}';
    }
}
