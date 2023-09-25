package by.flameksandr.streamapi;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Starter {
    public static void main(String[] args) {

        Stream<String> objectStream = Arrays.stream(new String[]{
                "a", "b", "c"
        });

        IntStream intStream = Arrays.stream(new int[]{1,2,3});
        LongStream longStream = Arrays.stream(new long[]{1l,2l,3l});
        DoubleStream doubleStream = Arrays.stream(new double[]{1d,2d,3d});

        objectStream.forEach(System.out::println);

        intStream.forEach(System.out::println);
        longStream.forEach(System.out::println);
        doubleStream.forEach(System.out::println);

    }
}
