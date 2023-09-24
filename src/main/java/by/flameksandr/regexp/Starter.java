package by.flameksandr.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Starter {
    public static void main(String[] args) {
        int counter = 0;
        String macAddressString = "aleksandr@gmail.com";

        Pattern pattern = Pattern.compile("^((\\w|[+-])+(\\.[\\w-]+)*@[\\w-]+((\\.[\\d\\p{Alpha}]+)*(\\.\\p{Alpha}{2,})*)*)$");

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
