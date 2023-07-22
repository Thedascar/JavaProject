package br.com.ReinforcingJava.Nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


class ListAllFIles2 extends SimpleFileVisitor<Path> {
    protected ListAllFIles2() {
        super();
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return super.preVisitDirectory(dir, attrs);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return super.postVisitDirectory(dir, exc);
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){

        if(file.getFileName().toString().endsWith(".java")) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;


    }
}


public class SimpleFileVisitorTeste02 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get(".");
        Files.walkFileTree(path, new ListAllFIles2());

    }
}
