package main.java.com.pczapski.patterns.behavioral.observer;

class ConreteSubject extends Subject {
    private String state;

    String getState() {
        return state;
    }

    void setState(String state) {
        this.state = state;
        setChanged();
        notifyObservers();
    }
}
