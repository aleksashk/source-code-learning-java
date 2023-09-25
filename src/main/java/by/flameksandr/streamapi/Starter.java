package by.flameksandr.streamapi;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Starter {
    public static void main(String[] args) {

        Stream<String> objectStream = Stream.of("asd", "qwe", "zxcv");
        objectStream.forEach(System.out::println);

        IntStream intStream = IntStream.of(1, 2, 3, 4);
        intStream.forEach(System.out::println);
        LongStream longStream = LongStream.of(1L, 2L, 3L, 4L);
        longStream.forEach(System.out::println);
        DoubleStream doubleStream = DoubleStream.of(1D, 2D, 3D, 4D);
        doubleStream.forEach(System.out::println);
    }
}
