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

        System.out.println("-----------5---------------");
// $ - поиск в конце строки
        Pattern pattern5 = Pattern.compile("[a-z]$");
        Matcher matcher5 = pattern5.matcher("1 2 3 K D A g");
        System.out.println(matcher5.find());

        Matcher matcher51 = pattern5.matcher("a d s k l e 1");
        System.out.println(matcher51.find());

        System.out.println("-----------6---------------");
// . - любое совпадение с заданным символом
        Pattern pattern6 = Pattern.compile(".[a-z]");
        Matcher matcher6 = pattern6.matcher("1 2 3 K D A g");
        System.out.println(matcher6.find());

        Matcher matcher61 = pattern6.matcher("1 2 N");
        System.out.println(matcher61.find());

        Matcher matcher62 = pattern6.matcher("1 h N");
        System.out.println(matcher62.find());


        System.out.println("-----------7---------------");
// | - "или", тоесть поиск в альтернативной реализации регулярного выражения
        Pattern pattern7 = Pattern.compile(".[a-z]|.[0-9]");
        Matcher matcher7 = pattern7.matcher("1 2 3 K D A g");
        System.out.println(matcher7.find());

        Matcher matcher71 = pattern7.matcher("N Y K");
        System.out.println(matcher71.find());

        Matcher matcher72 = pattern7.matcher("1 h N");
        System.out.println(matcher72.find());

    }
}
