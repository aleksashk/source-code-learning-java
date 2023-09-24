package by.flameksandr.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Starter {
    public static void main(String[] args) {

        String phoneNumber = "+3750174568712";
        Pattern pattern = Pattern.compile("^((\\+?375)(\\d{10}))$");
        Matcher matcher = pattern.matcher(phoneNumber);
        if(matcher.find()){
            System.out.println("PhoneNumber '" + phoneNumber + "' is correct!");
        }else {
            System.out.println("PhoneNumber '" + phoneNumber + "' is incorrect!");
        }
    }
}
