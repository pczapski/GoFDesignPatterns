package main.java.com.pczapski.patterns.behavioral.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        IterableClass iterableClass = new IterableClass();

        for (String item : iterableClass) {
            System.out.println(item);
        }
    }
}
