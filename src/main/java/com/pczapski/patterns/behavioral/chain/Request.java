package main.java.com.pczapski.patterns.behavioral.chain;

public class Request {

    Type getType() {
        return type;
    }

    enum Type {
        IMPORTANT,
        UNIMPORTANT
    }

    private Type type;

    Request(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ":" + type.name();
    }
}
