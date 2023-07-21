package br.com.BoraJava.nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTeste02 {
    public static void main(String[] args) throws IOException {
        Path pastPath = Paths.get("pasta");
        if (Files.notExists(pastPath)) {
            Path pastaDirectory = Files.createDirectory(pastPath);
        }
            Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
            Path subPastaDirectory = Files.createDirectories(subPastaPath);
            Path filePath = Paths.get(subPastaPath.toString(),"file.txt");
            if(Files.notExists(filePath)) {
                Path filePatchCreated = Files.createFile(filePath);
            }

            Path source = filePath;
            Path target = Paths.get(filePath.getParent().toString(),"file_renamed.txt");
            Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
    }
}
