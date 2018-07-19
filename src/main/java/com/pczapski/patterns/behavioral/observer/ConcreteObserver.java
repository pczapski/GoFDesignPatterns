package main.java.com.pczapski.patterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {

    private String state;

    ConcreteObserver(String state) {
        this.state = state;
        printState();
    }

    @Override
    public void update(Observable o, Object arg) {
        state = ((ConreteSubject)o).getState();
        printState();
    }

    private void printState() {
        System.out.println(this.hashCode() + ": My new state: " + state);
    }
}
