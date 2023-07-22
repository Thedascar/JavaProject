package br.com.ReinforcingJava.FilesIO;

import java.io.File;
import java.io.IOException;

public interface FilesTesteDiretorio {
    public static void main(String[] args) {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println(isDiretorioCriado);

        File fileArquivoDiretorio = new File(fileDiretorio,"texto.txt");
        boolean isFileCreateded = false;
        try {
            isFileCreateded = fileArquivoDiretorio.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(isFileCreateded);

        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File diretorioRenamed = new File("pasta_renomeada");
        boolean isRenamedPasta = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println(isRenamedPasta);
    }
}
