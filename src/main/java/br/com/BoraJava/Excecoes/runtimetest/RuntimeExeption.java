package br.com.BoraJava.Excecoes.runtimetest;

import br.com.fundamentosjava.Collections.Fila.FilaJava;

import java.io.File;
import java.io.IOException;

public class RuntimeExeption {
    public static void main(String[] args) throws IOException {

        criarNovoArquio();
    }

    private static void criarNovoArquio() throws IOException {
        File file = new File("src/main/java/br/com/BoraJava/Excecoes/runtimetest/arquivo\\teste.txt");
        try{
            file.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Não deu");
            throw e;
        }

    }
}
