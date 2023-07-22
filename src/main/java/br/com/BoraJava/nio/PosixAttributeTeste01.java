package br.com.BoraJava.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;

public class PosixAttributeTeste01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/lucas/dev/file.txt");
        PosixFileAttributes posixAttributeTeste01 = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(posixAttributeTeste01.permissions());
        PosixFileAttributeView fileatributeview = Files.getFileAttributeView(path, PosixFileAttributeView.class);
       // Set<PosixFilePermission> posixFilePermissionSet = PosixFilePermission.fromString("rw-rw-rw");
        //fileatributeview.setPermissions(posixFilePermissionSet);
        System.out.println(fileatributeview.readAttributes().permissions());
    }
}
