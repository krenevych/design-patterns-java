public class Client {
    public static void main(String[] args) {

        Request[] requests = {
            new Request(Request.Type.TYPE1),
            new Request(Request.Type.TYPE2),
            new Request(Request.Type.TYPE1),
            new Request(Request.Type.TYPE3),
            new Request(Request.Type.TYPE4),
            new Request(Request.Type.TYPE2),
            new Request(Request.Type.TYPE4),
            new Request(Request.Type.TYPE1),
        };

        HandlersManager handlersManager = new HandlersManager();
        Handler handler = handlersManager.getHandler();

        for (Request request : requests) {
            handler.handle(request);
        }


    }
}
