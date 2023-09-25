package by.flameksandr.io;

import java.io.FileReader;
import java.io.IOException;

public class Starter {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("file10.txt")) {
            int symbol;
            while ((symbol = reader.read()) != -1) {
                System.out.print((char)symbol);
            }
        } catch (IOException e) {
            System.out.println("Input error");
        }
    }
}
