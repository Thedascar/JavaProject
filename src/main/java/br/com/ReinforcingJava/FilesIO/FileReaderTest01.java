package br.com.ReinforcingJava.FilesIO;

import java.io.*;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try {
            FileReader fr = new FileReader(file);

            int i;
            while((i=fr.read()) != -1){
                System.out.print((((char) i)));
            }

            fr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
