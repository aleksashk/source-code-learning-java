package by.flameksandr.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Starter {
    public static void main(String[] args) {
        int counter = 0;
        String IPv6 = "1:1:1:1:1:1:1:1";

        Pattern pattern = Pattern.compile(
                "^(" +
                        "(\\p{XDigit}{1,4}:){7}\\p{XDigit}{1,4}|" +
                        "(\\p{XDigit}{1,4}:){1,7}:|" +
                        "(\\p{XDigit}{1,4}:){1,6}(:(\\p{XDigit}{1,4}))|" +
                        "(\\p{XDigit}{1,4}:){1,5}(:(\\p{XDigit}{1,4})){1,2}|" +
                        "(\\p{XDigit}{1,4}:){1,4}(:(\\p{XDigit}{1,4})){1,3}|" +
                        "(\\p{XDigit}{1,4}:){1,3}(:(\\p{XDigit}{1,4})){1,4}|" +
                        "(\\p{XDigit}{1,4}:){1,2}(:(\\p{XDigit}{1,4})){1,5}|" +
                        "(\\p{XDigit}{1,4}:)(:(\\p{XDigit}{1,4})){1,6}|" +
                        "(:((:(\\p{XDigit}{1,4})){1,7})|" +
                        "::(ffff(:0{1,4})?:)?(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])|" +
                        "((\\p{Digit}{1,4}):){1,4}:(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])|" +
                        "))$");

        Matcher matcher = pattern.matcher(IPv6);

        while (matcher.find()) {
            counter++;
            System.out.println("Match found '" +
                    IPv6.substring(matcher.start(), matcher.end()) +
                    "'. Starting at index " + matcher.start() +
                    " and ending at index " + matcher.end());
        }
        System.out.println("Matches found: " + counter);

    }
}
