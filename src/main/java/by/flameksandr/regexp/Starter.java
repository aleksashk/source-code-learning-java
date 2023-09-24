package by.flameksandr.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Starter {
    public static void main(String[] args) {
        int counter = 0;
        String macAddressString = "77:a3:d2:01:ff:63";

        Pattern pattern = Pattern.compile("^(((\\p{XDigit}{2})([:-]|$)){6})$");

        Matcher matcher = pattern.matcher(macAddressString);

        while (matcher.find()) {
            counter++;
            System.out.println("Match found '" +
                    macAddressString.substring(matcher.start(), matcher.end()) +
                    "'. Starting at index " + matcher.start() +
                    " and ending at index " + matcher.end());
        }
        System.out.println("Matches found: " + counter);

    }
}
