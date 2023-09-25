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
        Map<Boolean, List<Computer>> computers = stream.collect(Collectors.partitioningBy(c -> c.getPrice() > 1000));
        for (Map.Entry<Boolean, List<Computer>> item : computers.entrySet()) {
            if (item.getKey()) {
                showProducts("more", item);
            } else {
                showProducts("less", item);
            }
        }

    }

    private static void showProducts(String status, Map.Entry<Boolean, List<Computer>> item) {
        System.out.printf("Price is %s than $1000: %n", status);
        for (Computer c : item.getValue()) {
            System.out.printf("Type: %s, Company: %s, Model: %s %n", c.getType(), c.getCompany(), c.getModel());
        }
        System.out.println();
    }
}
