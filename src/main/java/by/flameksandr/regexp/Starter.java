package by.flameksandr.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Starter {
    public static void main(String[] args) {

        int counter = 0;
        String string = "196.198.1.197";
        Pattern pattern = Pattern.compile(".*?19");
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Match found '" +
                    string.substring(matcher.start(), matcher.end()) +
                    "'. Starting at index " +
                    " and ending at index " + matcher.end());
            counter++;
        }

        System.out.println("Matchers found: " + counter);

    }
}
