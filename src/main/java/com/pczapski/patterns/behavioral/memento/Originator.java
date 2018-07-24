package main.java.com.pczapski.patterns.behavioral.memento;

class Originator {
    private String state;

    Memento createMemento() {
        return new Memento(state);
    }

    void restore(Memento memento) {
        setState(memento.getState());
    }

    void setState(String state) {
        this.state = state;
        System.out.println("New state: " + state);
    }
}
