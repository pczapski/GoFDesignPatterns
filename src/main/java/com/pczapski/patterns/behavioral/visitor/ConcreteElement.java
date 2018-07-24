package main.java.com.pczapski.patterns.behavioral.visitor;

public class ConcreteElement implements Element {
    private Element[] elements;

    ConcreteElement(Element... elements) {
        this.elements = elements;
    }

    @Override
    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
        visitor.visit(this);
    }

    void operation() {
        System.out.println("Calling operation() in " + getClass().getSimpleName());
    }
}
