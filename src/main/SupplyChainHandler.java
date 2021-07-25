package main;

public class SupplyChainHandler extends RequestHandler {

    public SupplyChainHandler(RequestHandler next) {
        super(next);
    }


    @Override
    public void handleRequest(Request req) {
        if (RequestType.FIND_SUPPLIER == req.getRequestType()) {
            printHandler(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Supplier Handler";
    }
}
