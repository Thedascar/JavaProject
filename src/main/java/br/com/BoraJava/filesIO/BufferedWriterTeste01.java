package br.com.BoraJava.filesIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter br = new BufferedWriter(fw);
            br.write("Locura total Locura total e denovo aqui");
            br.newLine();
            br.write("Locura total Locura total e denovo aqui," +
                    "show demais essas loucuras");
            br.flush();
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
