package by.flameksandr.streamapi;

import java.util.stream.Stream;

public class Starter {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("val1", "val2", "val3", "val4", "val5");
//        stream.skip(2).forEach(System.out::println);
        stream.limit(3).forEach(System.out::println);
    }
}
