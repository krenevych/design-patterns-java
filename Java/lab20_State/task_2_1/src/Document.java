public class Document {
    public Document() {
    }

    public void publish(String user) {
    }

    public void abandon(String user) {
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
}
