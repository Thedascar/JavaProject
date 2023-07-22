package br.com.BoraJava.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipOutPUTeste01 {
    public static void main(String[] args) {
        Path path = Paths.get("pasta/arquivo.zip");
        Path arquivoParaZip = Paths.get("pasta/subpasta/subsubpasta");
        zip(path,arquivoParaZip);
    }

    private static void zip(Path arquivoZip, Path arquivosParaZipar){
        try(ZipOutputStream zipstream = new ZipOutputStream(Files.newOutputStream(arquivoZip))){
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar);
            for(Path file: directoryStream){
                ZipEntry zipentry = new ZipEntry(file.getFileName().toString());
                zipstream.putNextEntry(zipentry);
                Files.copy(file,zipstream);
                zipstream.closeEntry();

                System.out.println(file.getFileName());
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
