package br.com.ReinforcingJava.Nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/novo.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path,BasicFileAttributes.class);

        FileTime creatinTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();


        System.out.println("creation "+ creatinTime);
        System.out.println("lasModifiedTime "+ lastModifiedTime);
        System.out.println("lastAccesTime "+ lastAccessTime);


        BasicFileAttributeView filegetAttributesView = Files.getFileAttributeView(path,BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        filegetAttributesView.setTimes(lastModifiedTime,newCreationTime,creatinTime);


         creatinTime = filegetAttributesView.readAttributes().creationTime();
         lastModifiedTime = filegetAttributesView.readAttributes().lastModifiedTime();
         lastAccessTime = filegetAttributesView.readAttributes().lastAccessTime();


        System.out.println("creation "+ creatinTime);
        System.out.println("lasModifiedTime "+ lastModifiedTime);
        System.out.println("lastAccesTime "+ lastAccessTime);

    }



}
