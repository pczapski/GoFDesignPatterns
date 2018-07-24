package main.java.com.pczapski.patterns.behavioral.visitor;

public class ConcreteElement1 implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    void operation1() {
        System.out.println("Calling operation1() in " + getClass().getSimpleName());
    }
}
