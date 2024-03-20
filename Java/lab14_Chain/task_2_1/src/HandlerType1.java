public class HandlerType1 extends Handler {
    @Override
    public void handle(Request request) {
        if (request instanceof RequestType1) {
            System.out.println("Type1: Handle request " + request);
        } else {
            super.handle(request);
        }

    }
}
