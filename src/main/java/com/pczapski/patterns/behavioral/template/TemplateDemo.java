package main.java.com.pczapski.patterns.behavioral.template;

public class TemplateDemo {
    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.operation1();
        concreteClass.operation2();
        concreteClass.templateMethod();
    }
}
