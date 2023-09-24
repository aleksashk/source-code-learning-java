package by.flameksandr.regexp;

import java.util.regex.Pattern;

public class Starter {
    public static void main(String[] args) {

        System.out.println(Pattern.compile("10{2}").matcher("10").find());

    }
}
