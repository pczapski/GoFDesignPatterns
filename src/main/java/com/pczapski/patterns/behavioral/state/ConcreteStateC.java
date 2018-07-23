package main.java.com.pczapski.patterns.behavioral.state;

public class ConcreteStateC implements State {
    private final Context context;

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    ConcreteStateC(Context context) {
        this.context = context;
    }

    @Override
    public void handle() {
        context.setState(context.getStateA());
    }
}
