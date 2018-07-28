package main.java.com.pczapski.patterns.behavioral.template;

abstract class AbstractClass {
    abstract void operation1();
    abstract void operation2();

    void templateMethod() {
        System.out.println("Template method called.");
    }
}
