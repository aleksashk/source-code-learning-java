package by.flameksandr.streamapi;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Starter {
    public static void main(String[] args) {

        Stream<Order> orders = Stream.of(new Order(0, "context 1"), new Order(1, "context 2"), new Order(2, "context 3"), new Order(3, "context 4"), new Order(4, "context 5"));

        orders.collect(Collectors.toMap(Order::getId, Order::getContext))
                .forEach((key, value) -> System.out.printf("Key: %d, Value: %s %n", key, value));
    }
}
