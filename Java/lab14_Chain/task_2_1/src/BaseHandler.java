public class BaseHandler implements Handler {

    private Handler next = null;
    @Override
    final public void setNext(Handler handler) {
        next = handler;
    }

    @Override
    public void handle(Request request) {
        if (next != null){
            next.handle(request);
        } else {
            throw new RuntimeException("Запит не оброблений");
        }
    }
}
