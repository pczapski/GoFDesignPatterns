package main.java.com.pczapski.patterns.behavioral.visitor;

public interface Element {
    void accept(Visitor visitor);
}
