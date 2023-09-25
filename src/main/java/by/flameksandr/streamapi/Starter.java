package by.flameksandr.streamapi;

import java.util.stream.Stream;

public class Starter {
    public static void main(String[] args) {
        Stream<Integer> mixedNumbers = Stream.of(-2, -1, 0, 1, 2);

        System.out.println(mixedNumbers.count());
    }
}
