package by.flameksandr.lambdaStreamApi;

public class Starter {
    public static void main(String[] args) {

        Printer printer = string -> System.out.println(string);
        printer.println("Hello world");

    }
}
