package main.java.com.pczapski.patterns.behavioral.madiator;

import java.util.ArrayList;
import java.util.List;

public class MediatorA implements Mediator {

    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void mediate() {
        System.out.println("Mediating...");
        for (Colleague colleague : colleagues) {
            if (colleague.getState().isEmpty()) {
                colleague.setState("NEW");
                System.out.println(colleague.getClass().getSimpleName() + ": State set to "
                        + colleague.getState());
            }
        }
    }
}
