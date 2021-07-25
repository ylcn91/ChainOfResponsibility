package main;

public class App {

    public static void main(String[] args) {

        Ceo ceo = new Ceo();
        ceo.makeRequest(new Request(RequestType.COLLECT_CV, "find someone to hire"));
        ceo.makeRequest(new Request(RequestType.FIND_SUPPLIER, "find supplier for coffee"));
        ceo.makeRequest(new Request(RequestType.CREATE_REPORT, "create report for budget."));
    }

}
