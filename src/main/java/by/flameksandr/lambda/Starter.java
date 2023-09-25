package by.flameksandr.lambda;

public class Starter {

    public static void main(String[] args) {
        System.out.println(getOperation('*').getResult(10,5));
    }

    private static Operation getOperation(char symbol) {
        switch (symbol) {
            case '*':
                return (value1, value2) -> value1 * value2;
            case '/':
                return (value1, value2) -> value1 / value2;
            case '+':
                return (value1, value2) -> value1 + value2;
            case '-':
                return (value1, value2) -> value1 - value2;
            default:
                return (value1, value2) -> 0;
        }
    }
}
