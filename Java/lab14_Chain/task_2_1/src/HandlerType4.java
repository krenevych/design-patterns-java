public class HandlerType4 extends Handler {
    @Override
    public void handle(Request request) {
        if (request instanceof RequestType4){
            System.out.println("Type4: Handle request " + request);
        } else {
            super.handle(request);
        }
    }
}
