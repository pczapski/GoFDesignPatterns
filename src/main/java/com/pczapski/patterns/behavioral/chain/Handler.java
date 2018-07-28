package main.java.com.pczapski.patterns.behavioral.chain;

abstract class Handler {
    private final Handler next;

    Handler(Handler next) {
        this.next = next;
    }

    void handleRequest(Request request) {
        if (next != null) {
            next.handleRequest(request);
        }
    }
}
