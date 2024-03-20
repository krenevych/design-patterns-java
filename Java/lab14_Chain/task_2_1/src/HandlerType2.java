public class HandlerType2 extends Handler {
    @Override
    public void handle(Request request) {
        if (request instanceof RequestType2){
            System.out.println("Type2: Handle request " + request);
        } else {
            super.handle(request);
        }
    }
}
