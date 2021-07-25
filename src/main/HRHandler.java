package main;

public class HRHandler extends RequestHandler{


    public HRHandler(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request req) {
        if (RequestType.COLLECT_CV == req.getRequestType()) {
            printHandler(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "HRHandler";
    }
}
