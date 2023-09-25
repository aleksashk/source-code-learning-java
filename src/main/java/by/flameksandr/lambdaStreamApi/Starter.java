package by.flameksandr.lambdaStreamApi;

import java.util.Scanner;
import java.util.function.Supplier;

public class Starter {


    public static void main(String[] args) {

        Supplier<String> text = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter text: ");
            return scanner.nextLine();
        };

            System.out.println(text.get());

    }
}
