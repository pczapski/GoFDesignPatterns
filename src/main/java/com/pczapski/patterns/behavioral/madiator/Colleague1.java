package main.java.com.pczapski.patterns.behavioral.madiator;

public class Colleague1 implements Colleague {
    private String state = "";

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }
}
