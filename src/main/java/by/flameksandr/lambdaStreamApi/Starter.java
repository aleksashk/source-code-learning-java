package by.flameksandr.lambdaStreamApi;

public class Starter {

    private static double value1 = 3;
    private static double value2 = 5;

    public static void main(String[] args) {

        Operation operation = () -> value1 + value2;
        System.out.println(operation.getResult());
        System.out.println(value1);
        System.out.println(value2);
    }
}
