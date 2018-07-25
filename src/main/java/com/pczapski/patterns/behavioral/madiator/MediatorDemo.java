package main.java.com.pczapski.patterns.behavioral.madiator;

public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new MediatorA();

        mediator.addColleague(new Colleague1());

        Colleague2 colleague2 = new Colleague2();
        colleague2.setState("OLD");
        mediator.addColleague(colleague2);

        mediator.mediate();
    }
}
