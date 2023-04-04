public class ConcreteHandler4 extends BaseHandler {

    @Override
    public void handle(Request request) {
        if (request.getType() == Request.Type.TYPE4) {
            System.out.println("Type4: Handle request " + request);
        } else {
            super.handle(request);
        }
    }
}
