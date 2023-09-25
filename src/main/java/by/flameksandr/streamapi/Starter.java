package by.flameksandr.streamapi;

import java.util.Optional;
import java.util.stream.Stream;

public class Starter {
    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of();
        Optional<Integer> result = numbers.min(Integer::compare);
        result.ifPresentOrElse(System.out::println, () -> System.out.println("Stream element not found"));
    }
}
