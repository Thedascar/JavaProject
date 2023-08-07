package br.com.ReinforcingJava.Streams.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> lista1 = new ArrayList<>();
        List<String> graphDessigner = List.of("Jose","Maria");
        List<String> developers = List.of("Lucas","Aline");
        List<String> students = List.of("Nossal","Geremonio");
        lista1.add(graphDessigner);
        lista1.add(developers);
        lista1.add(students);

        lista1.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
