package by.flameksandr.io;

import java.io.FileInputStream;
import java.io.IOException;

public class Starter {
    public static void main(String[] args) {

        try (FileInputStream stream = new FileInputStream("text2.txt")) {
            int symbol;
            while ((symbol = stream.read()) != -1) {
                System.out.print((char) symbol);
            }
        } catch (IOException e) {
            System.out.println("Input error");
        }
    }
}
