package by.flameksandr.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Starter {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("(\\d+)");
        Matcher matcher = pattern.matcher("2016 year. 2017 year. 2018 year");

        while (matcher.find()){
            System.out.println(matcher.group(1));
        }

    }
}
