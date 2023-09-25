package by.flameksandr.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Starter {

    private static final String PATH = "object.txt";

    public static void main(String[] args) {
        serialize();
    }

    private static void serialize() {
        SerializableClass serializableClass = new SerializableClass(SerializableClass.class.getName(), 0);
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(PATH))) {
            stream.writeObject(serializableClass);
        } catch (IOException e) {
            System.out.println("Output error");
        }

    }

    private static class SerializableClass implements Serializable {
        private String title;
        private int size;

        public SerializableClass(String title, int size) {
            this.title = title;
            this.size = size;
        }
    }
}
