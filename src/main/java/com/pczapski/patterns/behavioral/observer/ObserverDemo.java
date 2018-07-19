package main.java.com.pczapski.patterns.behavioral.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        ConreteSubject subject = new ConreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver("INIT");
        ConcreteObserver observer2 = new ConcreteObserver("INIT");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setState("OPEN");
        subject.setState("CLOSED");
    }
}
