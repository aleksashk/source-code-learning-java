package by.flameksandr.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Starter {
    public static void main(String[] args) {
        int counter = 0;
        String ipAddress = "0.0.0.0";

        Pattern ipv4Pattern = Pattern.compile("^(((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])))$");

        Matcher matcher = ipv4Pattern.matcher(ipAddress);

        while (matcher.find()) {
            counter++;
            System.out.println("Match found '" +
                    ipAddress.substring(matcher.start(), matcher.end()) +
                    "'. Starting at index " + matcher.start() +
                    " and ending at index " + matcher.end());
        }

        System.out.println("Matchers found: " + counter);
    }
}
