package main.java.com.pczapski.patterns.behavioral.strategy;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing: " + this.getClass().getSimpleName());
    }
}
