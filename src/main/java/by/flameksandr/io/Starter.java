package by.flameksandr.io;

import java.io.File;

public class Starter {
    public static void main(String[] args) {
        File directory = new File("src/backup");

        if (!directory.exists()) {
            System.out.println(directory.mkdir() ? "Successfully" : "Failed");
        } else {
            System.out.println( "Directory: '" + directory.getName() + "' is already exists");
        }

        String path = "src/main/java/by/flameksandr/io/backup";

        File dir = new File(path);
        if(dir.isDirectory()){
            String[] content = dir.list();
            if(content != null){
                for (String s: content){
                    File file = new File(path + "/" + s);
                    System.out.println(file.isDirectory() ?(s + " is a directory") : (s + " is a file"));
                }
            }
        }
    }
}
