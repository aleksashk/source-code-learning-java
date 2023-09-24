package by.flameksandr.io;

import java.io.File;

public class Starter {
    public static void main(String[] args) {
        String string = "D:/sample/sample.txt";
        File file = new File(string);
        System.out.println("File name: " + file.getName());
        System.out.println("Path: " + file.getPath());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("File directory: " + file.getParent());
        System.out.println("File length: " + file.length());


        System.out.println("File: " + (file.exists() ? "exists" : "does not exist"));
        System.out.println("File: " + (file.canWrite() ? "writable" : "dot writable"));
        System.out.println("File: " + (file.canRead() ? "readable" : "dot readable"));
        System.out.println("File: " + (file.isDirectory() ? "is directory" : "is not directory"));
        System.out.println("File: " + (file.isFile() ? "is file" : "is not file"));
        System.out.println("File: " + (file.isHidden() ? "is hidden" : "is not hidden"));

        System.out.println("Get total space: " + CapacityFormatter.toGigabytes(file.getTotalSpace()) + " Gb");
        System.out.println("Get total space: " + CapacityFormatter.toGigabytes(file.getFreeSpace()) + " Gb");
    }

    private static class CapacityFormatter {

        private static long toGigabytes(long capacity) {
            return capacity / (long) Math.pow(10, 9);
        }
    }
}
