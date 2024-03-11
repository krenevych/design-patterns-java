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


        for (Request request : requests) {
            if (request.getType() == Request.Type.TYPE1) {
                System.out.println("Type1: Handle request " + request);
            } else if (request.getType() == Request.Type.TYPE2) {
                System.out.println("Type2: Handle request " + request);
            } else if (request.getType() == Request.Type.TYPE3) {
                System.out.println("Type3: Handle request " + request);
            } else if (request.getType() == Request.Type.TYPE4) {
                System.out.println("Type4: Handle request " + request);
            } else {
                System.out.println("Unhandled request " + request);
            }
        }


    }
}
