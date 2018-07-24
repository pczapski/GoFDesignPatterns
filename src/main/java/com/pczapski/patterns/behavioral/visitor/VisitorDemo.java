package main.java.com.pczapski.patterns.behavioral.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        Element concreteElement = new ConcreteElement(new ConcreteElement1(), new ConcreteElement2());
        concreteElement.accept(new ConreteVisitorA());
        concreteElement.accept(new ConreteVisitorB());
    }
}
