public class HandlerType3 extends Handler {
    @Override
    public void handle(Request request) {
        if (request instanceof RequestType3){
            System.out.println("Type3: Handle request " + request);
        } else {
            super.handle(request);
        }
    }
}
