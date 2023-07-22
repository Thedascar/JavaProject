package br.com.ReinforcingJava.FilesIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            FileWriter fw = new FileWriter(file,true);
            fw.write("Locura total\n Locura total e denovo aqui");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
