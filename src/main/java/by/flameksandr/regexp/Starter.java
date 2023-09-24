package by.flameksandr.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Starter {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("(:?Mouse|Keyboard)Listener");
        Matcher matcher = pattern.matcher("MouseListener KeyboardListener");

        while (matcher.find()){
            System.out.println(matcher.group(1));
        }

    }
}
