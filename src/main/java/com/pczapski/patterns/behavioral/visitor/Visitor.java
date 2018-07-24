package main.java.com.pczapski.patterns.behavioral.visitor;

public interface Visitor {
    void visit(ConcreteElement element);
    void visit(ConcreteElement1 element);
    void visit(ConcreteElement2 element);
}
