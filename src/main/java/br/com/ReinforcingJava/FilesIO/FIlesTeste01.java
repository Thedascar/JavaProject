package br.com.ReinforcingJava.FilesIO;

import java.io.File;
import java.io.IOException;

public class FIlesTeste01 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\lucas\\OneDrive\\Documents\\AmbienteDev\\JavaProject\\arquivos\\text.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created "+ isCreated);
            System.out.println("Path: " + file.getPath());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Is directory: " + file.isDirectory());
            System.out.println("Is File: " + file.isFile());
            System.out.println("Is Hidden: " + file.isHidden());
            System.out.println("Last Modified: " + file.lastModified());
            boolean exist = file.exists();
            if(exist){
                System.out.println("Deleted "+ file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
