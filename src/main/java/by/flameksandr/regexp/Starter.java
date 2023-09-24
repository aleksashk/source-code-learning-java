package by.flameksandr.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Starter {
    public static void main(String[] args) {

        String cardNumber = "2234567896584521";
        String date = "12/74";
        String cvv = "56";

        Pattern cardNumberPattern = Pattern.compile("([2-6]([0-9]{3}) ?)(([0-9]{4} ?){3})");
        Pattern datePattern = Pattern.compile("(0[1-9]|1[0-2])/([0-9]{2})");
        Pattern cvvPattern = Pattern.compile("[0-9]{3}");
        Matcher cardNumberMatcher = cardNumberPattern.matcher(cardNumber);
        Matcher dateMatcher = datePattern.matcher(date);
        Matcher cvvMatcher = cvvPattern.matcher(cvv);
        if (cardNumberMatcher.find() &&
                dateMatcher.find() &&
                cvvMatcher.find()) {
            System.out.println("PhoneNumber '" + cardNumber + " " + date + " " + cvv + "' is correct!");
        } else {
            System.out.println("PhoneNumber '" + cardNumber + " " + date + " " + cvv + "' is incorrect!");
        }
    }
}
