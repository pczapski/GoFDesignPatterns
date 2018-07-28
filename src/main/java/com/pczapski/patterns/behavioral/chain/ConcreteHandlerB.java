package main.java.com.pczapski.patterns.behavioral.chain;

class ConcreteHandlerB extends Handler {
    ConcreteHandlerB(Handler next) {
        super(next);
    }
}
