package by.flameksandr.streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Starter {
    public static void main(String[] args) {

        Stream<String> values = Stream.of("val1", "val2", "val3", "val4", "val5");
        List<String> list = values.collect(Collectors.toList());
        System.out.println(list);
    }
}
