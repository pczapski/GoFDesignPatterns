package main.java.com.pczapski.patterns.behavioral.chain;

public class ConcreteHandlerA extends Handler {

    ConcreteHandlerA(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals(Request.Type.IMPORTANT)) {
            System.out.println(ConcreteHandlerA.class.getSimpleName() + " can handle "
                    + request.getClass().getSimpleName() + ":" + request.getType());
        } else {
            super.handleRequest(request);
        }
    }
}
