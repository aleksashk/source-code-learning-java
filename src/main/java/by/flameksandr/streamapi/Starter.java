package by.flameksandr.streamapi;

import java.util.stream.Stream;

public class Starter {
    public static void main(String[] args) {

        Stream<String> passwords = Stream.of("asdf2342", "s5k3kf", "d7rhb", "xyz");
        passwords.filter(password -> password.length() >= 5).forEach(System.out::println);
    }
}
