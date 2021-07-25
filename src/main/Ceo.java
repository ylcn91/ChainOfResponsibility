package main;

/*
* Build chain
 */
public class Ceo {

    private RequestHandler chain;

    public Ceo() {
        buildChain();
    }

    private void buildChain() {
        chain = new HRHandler(new ReportingHandler(new SupplyChainHandler(null)));
    }

    public void makeRequest(Request req) {
        chain.handleRequest(req);
    }

}
