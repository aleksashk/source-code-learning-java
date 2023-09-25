package by.flameksandr.lambdaStreamApi;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Starter {


    public static void main(String[] args) {

        Consumer<String> printer = string-> System.out.println(string);
        printer.accept("Hello world");
    }
}
