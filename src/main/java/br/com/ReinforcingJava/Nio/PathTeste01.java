package br.com.ReinforcingJava.Nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTeste01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\lucas\\OneDrive\\Documents\\AmbienteDev\\JavaProject\\pasta_renomeada");
        System.out.println(p1.getFileName());
    }
}
