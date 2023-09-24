package by.flameksandr.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Starter {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[a-z]+");
        Matcher matcher1 = pattern.matcher("1 2 d k D L 3 6 ) & l c ,");
        System.out.println(matcher1.find());

        Matcher matcher2 = pattern.matcher("1 2 D L 3 6 ) & ,");
        System.out.println(matcher2.find());

        Pattern pattern2 = Pattern.compile("[a-zA-Z0-9]");
        Matcher matcher3 = pattern2.matcher("A B 3 56 L");
        System.out.println(matcher3.find());

        System.out.println("-----------4---------------");
// ^ - поиск в начале строки
        Pattern pattern4 = Pattern.compile("^[a-z]");
        Matcher matcher4 = pattern4.matcher("1 2 3 K D A");
        System.out.println(matcher4.find());

        Matcher matcher41 = pattern4.matcher("a d s k l e ");
        System.out.println(matcher41.find());

    }
}
