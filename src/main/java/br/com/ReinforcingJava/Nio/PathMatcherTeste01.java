package br.com.ReinforcingJava.Nio;

import java.nio.file.*;


public class PathMatcherTeste01 {
    public static void main(String[] args) {

        Path path1 = Paths.get("pasta/subspasta/file.bkp");
        Path path2 = Paths.get("pasta/subspasta/file.txt");
        Path path3 = Paths.get("pasta/subspasta/file.java");
        matches(path1,"glob:*.bkp");
        matches(path1,"glob:**/.bkp");
        matches(path1,"glob:**/*.{bkp,txt,java}");



        }

    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);System.out.println(glob + ": " + matcher.matches(path));

    }
}
