package by.flameksandr.lambdaStreamApi;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Starter {

    public static void main(String[] args) {

        UnaryOperator<Double> sqrt = value -> Math.sqrt(value);
        System.out.println(sqrt.apply(225.));

        BinaryOperator<Double> pow = (value1, value2) -> Math.pow(value1, value2);
        System.out.println(pow.apply(23., 2.));
    }
}
