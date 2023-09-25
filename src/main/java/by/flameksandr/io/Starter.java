package by.flameksandr.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class Starter {
    public static void main(String[] args) throws IOException {
        String text = "Some new text";
        byte[] bytes = text.getBytes();

        try (FileOutputStream stream = new FileOutputStream("text2.txt")) {
            for (byte eachByte : bytes) {
                stream.write(eachByte);
            }
        } catch (IOException e) {
            System.out.println("Output error");
        }
    }
}
