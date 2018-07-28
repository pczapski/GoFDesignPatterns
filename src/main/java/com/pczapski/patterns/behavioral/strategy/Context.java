package main.java.com.pczapski.patterns.behavioral.strategy;

class Context {
    private final Strategy strategy;

    Context(Strategy strategy) {
        this.strategy = strategy;
    }

    void request() {
        strategy.execute();
    }
}
