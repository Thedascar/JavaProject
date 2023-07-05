package br.com.BoraJava.Excecoes.runtimetest;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLException;

public class RuntimeException5 {
    public static void main(String[] args) {


    }

    public static void lerArquivo() {
        try(Reader reader = new BufferedReader(new FileReader("text.txt"))){

        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            try{
                reader.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }

}
