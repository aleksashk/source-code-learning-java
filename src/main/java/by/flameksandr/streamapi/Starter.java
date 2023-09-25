package by.flameksandr.streamapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Starter {
    public static void main(String[] args) {

        Stream<Computer> stream = Stream.of(
                new Computer("Desctop", "Apple", "iMack", 2562),
                new Computer("Laptop", "Lenovo", "Road67", 4588),
                new Computer("Desctop", "HP", "Tiranos", 866),
                new Computer("Laptop", "ACER", "Lamba", 5688),
                new Computer("Laptop", "MARSEL", "ROMB", 7840)
        );
        Map<String, List<Computer>> computers = stream.collect(Collectors.groupingBy(Computer::getType));
        for (Map.Entry<String, List<Computer>> item : computers.entrySet()) {
            System.out.println("Type: " + item.getKey());
            for (Computer c : item.getValue()) {
                System.out.printf("Company: %s, Model: %s, Price: %d %n", c.getCompany(), c.getModel(), c.getPrice());
            }
            System.out.println();
        }
    }
}
