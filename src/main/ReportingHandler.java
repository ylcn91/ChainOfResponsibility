package main;

public class ReportingHandler extends RequestHandler{

    public ReportingHandler(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request req) {
        if (RequestType.CREATE_REPORT == req.getRequestType()) {
            printHandler(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Reporting Handler";
    }
}
