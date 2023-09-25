package by.flameksandr.io;

import java.io.*;

public class Starter {

    private static final String PATH = "object.txt";

    public static void main(String[] args) {
        serialize();
        deserialize();
    }

    private static void serialize() {
        SerializableClass serializableClass = new SerializableClass(SerializableClass.class.getName(), 0);
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(PATH))) {
            stream.writeObject(serializableClass);
        } catch (IOException e) {
            System.out.println("Output error");
        }
    }

    private static void deserialize() {
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(PATH))) {
            SerializableClass serializableClass = (SerializableClass) stream.readObject();
            System.out.printf("Title %s%nSize:%d", serializableClass.title, serializableClass.size);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Input error");
        }
    }

    private static class SerializableClass implements Serializable {
        private transient String title;
        private int size;

        public SerializableClass(String title, int size) {
            this.title = title;
            this.size = size;
        }
    }
}
