package by.flameksandr.streamapi;

import java.util.Optional;
import java.util.stream.Stream;

public class Starter {
    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        Optional<Integer> result = numbers.reduce((value1, value2) -> value1 + value2);
        System.out.println(result.get());
    }
}
