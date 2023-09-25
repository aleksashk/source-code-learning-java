package by.flameksandr.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class Starter {
    public static void main(String[] args) {

        Stream<String> objectStream = Arrays.stream(new String[]{
                "a", "b", "c"
        });

        objectStream.forEach(System.out::println);

    }
}
