package main.java.com.pczapski.patterns.behavioral.chain;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        ConcreteHandlerC handlerC = new ConcreteHandlerC(null);
        ConcreteHandlerB handlerB = new ConcreteHandlerB(handlerC);
        ConcreteHandlerA handlerA = new ConcreteHandlerA(handlerB);

        handlerA.handleRequest(new Request(Request.Type.IMPORTANT));
        handlerA.handleRequest(new Request(Request.Type.UNIMPORTANT));

        handlerB.handleRequest(new Request(Request.Type.IMPORTANT));
        handlerB.handleRequest(new Request(Request.Type.UNIMPORTANT));

        handlerC.handleRequest(new Request(Request.Type.IMPORTANT));
        handlerC.handleRequest(new Request(Request.Type.UNIMPORTANT));
    }
}
