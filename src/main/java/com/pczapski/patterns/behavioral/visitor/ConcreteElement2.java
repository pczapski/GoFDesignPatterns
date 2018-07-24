package main.java.com.pczapski.patterns.behavioral.visitor;

public class ConcreteElement2 implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    void operation2() {
        System.out.println("Calling operation2() in " + getClass().getSimpleName());
    }
}
