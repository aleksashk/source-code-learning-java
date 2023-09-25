package by.flameksandr.lambdaStreamApi;

public class Starter {
    public static void main(String[] args) {

        Factorial factorial = value -> {
            int result = 1;
            for (int i = 1; i < value; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println(factorial.getResult(4));
    }
}
