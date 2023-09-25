package by.flameksandr.streamapi;

import java.util.Arrays;

public class Starter {
    public static void main(String[] args) {
        int[] numbers = {-1, 0, 3, -23, 12, -5};
        for (int eachNumber : numbers) {
            if (eachNumber < 0) {
                System.out.println(eachNumber);
            }
        }
        System.out.println("-------------------------------------------------------");

        Arrays.stream(numbers).filter(value -> value < 0).forEach(System.out::println);
    }
}
