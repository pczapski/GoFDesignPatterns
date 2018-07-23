package main.java.com.pczapski.patterns.behavioral.state;

public class Context {
    private final ConcreteStateA stateA;
    private final ConcreteStateB stateB;
    private final ConcreteStateC stateC;

    private State state;

    Context() {
        stateA = new ConcreteStateA(this);
        stateB = new ConcreteStateB(this);
        stateC = new ConcreteStateC(this);

        state = stateA;
    }

    void request() {
        state.handle();
    }

    ConcreteStateA getStateA() {
        return stateA;
    }

    ConcreteStateB getStateB() {
        return stateB;
    }

    void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return state.toString();
    }

    ConcreteStateC getStateC() {
        return stateC;
    }
}
