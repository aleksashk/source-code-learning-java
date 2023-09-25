package by.flameksandr.lambdaStreamApi;

import java.util.function.Predicate;

public class Starter {


    public static void main(String[] args) {

        Predicate<Integer> isZero = value -> value == 0;
        System.out.println(isZero.test(34));
    }
}
