package br.com.ReinforcingJava.FilesIO;

import java.io.*;

public class BufferedReaderTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            br.readLine();
            String linha;
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
