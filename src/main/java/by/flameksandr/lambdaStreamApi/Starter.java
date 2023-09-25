package by.flameksandr.lambdaStreamApi;

import java.util.function.Consumer;

public class Starter {

    public static void main(String[] args) {

        Consumer<String> printer = Starter::println;
        printer.accept("Hello from java");

    }

    private static void println(String text) {
        System.out.println(text);
    }
}
