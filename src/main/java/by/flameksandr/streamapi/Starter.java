package by.flameksandr.streamapi;

import java.util.stream.Stream;

public class Starter {
    public static void main(String[] args) {

        Stream<Film> filmStream = Stream.of(new Film("DeadPool", 100.0), new Film("Carbiners", 200.0), new Film("Mortal Combat", 150.0));
        filmStream.map(Film::getPrice).forEach(System.out::println);

    }
}
