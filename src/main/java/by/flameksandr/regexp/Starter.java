package by.flameksandr.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Starter {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("Java (?=7|8)");
        Matcher matcher = pattern.matcher("Java 7 Java 8");

        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
