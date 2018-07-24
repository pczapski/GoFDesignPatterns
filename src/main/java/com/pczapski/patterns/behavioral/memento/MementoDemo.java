package main.java.com.pczapski.patterns.behavioral.memento;

public class MementoDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("A");
        caretaker.save(originator);

        originator.setState("B");

        originator.setState("C");
        caretaker.save(originator);

        originator.setState("D");

        caretaker.restore(originator);
        caretaker.restore(originator);
    }
}
