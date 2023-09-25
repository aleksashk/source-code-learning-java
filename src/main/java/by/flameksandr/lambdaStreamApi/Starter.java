package by.flameksandr.lambdaStreamApi;

public class Starter {
    public static void main(String[] args) {

        Operation operation = new Operation() {
            @Override
            public double getResult(double value1, double value2) {
                return value1 + value2;
            }
        };

        System.out.println(operation.getResult(5, 8));


        Operation lambda = (value1, value2) -> value1 + value2;
        System.out.println(lambda.getResult(4, 23));
    }
}
