package by.flameksandr.regexp;

import java.util.regex.Pattern;

public class Starter {
    public static void main(String[] args) {

        System.out.println(Pattern.compile("10?").matcher("1000000 abra cadabra").find());
        System.out.println(Pattern.compile("10*").matcher("000000 abra cadabra").find());
        System.out.println(Pattern.compile("10+").matcher("1 abra cadabra").find());


    }
}
