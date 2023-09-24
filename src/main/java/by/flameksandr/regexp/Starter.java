package by.flameksandr.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Starter {
    public static void main(String[] args) {

//        int counter = 0;
//        String string = "asdfc 1234";
//        Pattern pattern = Pattern.compile("\\p{Digit}");
//        Matcher matcher = pattern.matcher(string);
//
//        while (matcher.find()) {
//            System.out.println("Match found: '" +
//                    string.substring(matcher.start(), matcher.end()) +
//                    "'. Starting at index " + matcher.start() +
//                    " and ending at index " + matcher.end());
//            counter++;
//        }
//        System.out.println("Matches found: " + counter);

        //альтернатива
//        int count = 0;
//        String str = "sdfsdfs 32 453 56534 2 0";
//        Pattern pattern1 = Pattern.compile("[\\d]");
//        Matcher matcher1 = pattern1.matcher(str);
//
//
//        while (matcher1.find()) {
//            System.out.println("Match found: '" +
//                    str.substring(matcher1.start(), matcher1.end()) +
//                    "'. Starting at index " + matcher1.start() +
//                    " and ending at index " + matcher1.end());
//            count++;
//        }
//        System.out.println("Matches found: " + count);


        //POSIX отлично подходит для поиска всех знаков пунктуации
        int counter = 0;
        String string = "#$%^& *()_+!@";
        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Match found: '" +
                    string.substring(matcher.start(), matcher.end()) +
                    "'. Starting at index " + matcher.start() +
                    " and ending at index " + matcher.end());
            counter++;
        }
        System.out.println("Matches found: " + counter);

    }
}
