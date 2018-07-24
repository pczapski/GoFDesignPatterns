package main.java.com.pczapski.patterns.behavioral.visitor;

public class ConreteVisitorB implements Visitor{

    @Override
    public void visit(ConcreteElement element) {
        System.out.print(this.getClass().getSimpleName() + ": ");
        element.operation();
    }

    @Override
    public void visit(ConcreteElement1 element) {
        System.out.print(this.getClass().getSimpleName() + ": ");
        element.operation1();
    }

    @Override
    public void visit(ConcreteElement2 element) {
        System.out.print(this.getClass().getSimpleName() + ": ");
        element.operation2();
    }
}
