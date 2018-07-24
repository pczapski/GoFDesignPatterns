package main.java.com.pczapski.patterns.behavioral.memento;

import java.util.Stack;

class Caretaker {
    private Stack<Memento> mementoStack = new Stack<>();

    void save(Originator originator) {
        System.out.println("Saving state to history");
        mementoStack.push(originator.createMemento());
    }

    void restore(Originator originator) {
        System.out.println("Restoring state");
        originator.restore(mementoStack.pop());
    }
}
