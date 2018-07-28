package main.java.com.pczapski.patterns.behavioral.chain;

class ConcreteHandlerC extends Handler {
    ConcreteHandlerC(Handler next) {
        super(next);
    }

    @Override
    void handleRequest(Request request) {
        if (request.getType().equals(Request.Type.UNIMPORTANT)) {
            System.out.println(this.getClass().getSimpleName() + " can handle " + request);
        } else {
            super.handleRequest(request);
        }
    }
}
