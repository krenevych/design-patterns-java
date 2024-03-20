abstract public class Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handle(Request request) {
        if (next != null)
            next.handle(request);
    }

}
