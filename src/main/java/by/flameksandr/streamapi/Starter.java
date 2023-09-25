package by.flameksandr.streamapi;

import java.util.ArrayList;
import java.util.Collections;

public class Starter {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names, "Franck", "Paolo", "Xenona");

        names.stream().filter(name -> name.length() >= 6).forEach(System.out::println);
    }
}
