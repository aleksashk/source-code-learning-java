package by.flameksandr.lambdaStreamApi;

public class Starter {


    public static void main(String[] args) {


        double value1 = 3;
        double value2 = 5;

        Operation operation = () -> {
            value1 = 100;
            return value1 + value2;
        };
        System.out.println(operation.getResult());
        System.out.println(value1);
        System.out.println(value2);
    }
}
