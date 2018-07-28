package main.java.com.pczapski.patterns.behavioral.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        new Context(new ConcreteStrategyA()).request();
        new Context(new ConcreteStrategyB()).request();
    }
}
