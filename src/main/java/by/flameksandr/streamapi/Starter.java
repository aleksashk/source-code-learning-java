package by.flameksandr.streamapi;

import java.util.stream.Stream;

public class Starter {
    public static void main(String[] args) {

        Stream<Pizza> pizzaStream = Stream.of(new Pizza("Peperoni", 90));
        pizzaStream.flatMap(pizza -> Stream.of(
                String.format("Pizza: %s, price: $%d", pizza.getTitle(), pizza.getPrice()),
                String.format("HAPPY HOURS DISCOUNT -50%%)%nPizza: %s, price: $%d", pizza.getTitle(), pizza.getPrice() / 2)
        )).forEach(System.out::println);
    }
}
