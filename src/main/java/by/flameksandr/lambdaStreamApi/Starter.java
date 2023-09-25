package by.flameksandr.lambdaStreamApi;

import java.util.function.Function;

public class Starter {


    public static void main(String[] args) {

        Function<Integer, Double> converter = value -> Double.valueOf(value);
        System.out.println(converter.apply(345));
    }
}
