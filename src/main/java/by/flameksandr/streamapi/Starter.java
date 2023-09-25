package by.flameksandr.streamapi;

import java.util.stream.Stream;

public class Starter {
    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        int result = numbers.reduce(10, (value1, value2) -> value1 + value2);
        System.out.println(result);
    }
}
