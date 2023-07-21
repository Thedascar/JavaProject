package br.com.BoraJava.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {

        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file =  new File("pasta/novo.txt");
        boolean isCreated = file.createNewFile();
        file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("pasta/novo_=ath.txt");
        Files.createFile(path);
        FileTime filetime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path,filetime);

        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));




    }
}
