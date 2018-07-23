package main.java.com.pczapski.patterns.behavioral.state;

public class ConcreteStateA implements State {
    private final Context context;

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    ConcreteStateA(Context context) {
        this.context = context;
    }

    @Override
    public void handle() {
        context.setState(context.getStateB());
    }
}
