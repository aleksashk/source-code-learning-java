package by.flameksandr.streamapi;

import java.util.Optional;
import java.util.stream.Stream;

public class Starter {
    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of();
        Optional<Integer> result = numbers.min(Integer::compare);
        System.out.println(result.orElse(0));
    }
}
