package by.flameksandr.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class Starter {
    public static void main(String[] args) throws IOException {
        String text = "Some text";
        byte[] buffer = text.getBytes();

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("file.txt");
            for (byte eachBufferElement : buffer) {
                fileOutputStream.write(eachBufferElement);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error of closing file.txt");
            }
        }
    }
}
