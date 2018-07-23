package main.java.com.pczapski.patterns.behavioral.state;

public class StateDemo {
    public static void main(String[] args) {
        Context context = new Context();

        System.out.println(context);

        context.request();

        System.out.println(context);

        context.request();

        System.out.println(context);

        context.request();

        System.out.println(context);
    }
}
