package by.flameksandr.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class Starter {
    public static void main(String[] args) throws IOException {
        String text = "Some text";
        byte[] buffer = text.getBytes();

        try (FileOutputStream fileOutputStream = new FileOutputStream("file1.txt")) {
            for (byte eachBufferElement : buffer) {
                fileOutputStream.write(eachBufferElement);
            }
        } catch (IOException e) {
            System.out.println("Input/output error");
        }
    }
}
