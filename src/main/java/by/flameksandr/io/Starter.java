package by.flameksandr.io;

import java.io.FileWriter;
import java.io.IOException;

public class Starter {
    public static void main(String[] args) {

        String string = "Hello world";
        char[] chars = new char[string.length()];
        string.getChars(0, chars.length, chars, 0);

        try (FileWriter writer = new FileWriter("file10.txt")) {
            for (char eachChars : chars) {
                writer.write(eachChars);
            }
        } catch (IOException e) {
            System.out.println("Output error");
        }
    }
}
