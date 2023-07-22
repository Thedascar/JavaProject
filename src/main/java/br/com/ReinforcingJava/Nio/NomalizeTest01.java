package br.com.ReinforcingJava.Nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NomalizeTest01 {
    public static void main(String[] args) {

        String diretorioDoProjeto = "home/lucas/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioDoProjeto,arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());

        Path path2 = Paths.get("/home/./lucas/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());


    }
}
