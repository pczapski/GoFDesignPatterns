package main.java.com.pczapski.patterns.behavioral.memento;

class Memento {
    private String state;

    Memento(String state) {
        setState(state);
    }

    String getState() {
        return state;
    }

    private void setState(String state) {
        this.state = state;
    }
}
