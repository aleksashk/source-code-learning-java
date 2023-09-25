package by.flameksandr.lambdaStreamApi;

public class Starter {


    public static void main(String[] args) {

        Operation<Integer> addition = (Integer value1, Integer value2) -> value1 + value2;
        System.out.println(addition.getResult(2, 3));
        Operation<String> concatenation = (String value1, String value2) -> value1 + value2;
        System.out.println(concatenation.getResult("New", " string"));
    }
}
